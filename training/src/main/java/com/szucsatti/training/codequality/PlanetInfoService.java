package com.szucsatti.training.codequality;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PlanetInfoService {

  static Map<String, Integer> name2Id = new HashMap<String, Integer>();
  static Map<Integer, PlanetInfo> id2Info = new HashMap<Integer, PlanetInfo>();

  private Map<String, Account> map = new HashMap<>();

  private DocumentDao documentDao;


  public PlanetInfoService() {
    documentDao = new FileSystemDocumentDao();
  }


  public PlanetInfo getPlanetInfoByName(final String name) {

    Integer planetId = name2Id.get(name);
    return planetId != null ? id2Info.get(planetId) : null;
  }


  public Set<Planet> getPlanetForDataset(final int datasetId) throws ServiceException {
    try {
      Set<Planet> set = new HashSet<Planet>();
      DataSet ds = documentDao.getDocument(datasetId);
      if (ds.getType() == DataSet.Type.VCF)
        for (int i = 0; i < ds.getRowCount(); i++) {
          DataSetRow row = ds.getRow(i);
          String name = row.getColumn(3);
          Integer planetId = name2Id.get(name);
          set.add(id2Info.get(datasetId));
        }
      else if (ds.getType() == DataSet.Type.MSF)
        for (int i = 0; i < ds.getRowCount(); i++) {
          DataSetRow row = ds.getRow(i);
          String name = row.getColumn(10);
          Integer planetId = name2Id.get(name);
          set.add(id2Info.get(datasetId));
        }
      return set;
    }
    catch (Exception e) {
      throw new ServiceException("Error processing dataset.", e);
    }
  }


  public Set<Account> getContractDetails(final Integer contractExpiringInXYears) {
    Set<Account> list = new HashSet<>();

    for (Account account : map.values())
      if (account.integer == contractExpiringInXYears)
        list.add(account);

    return list;
  }


  public void setDocumentDao(final DocumentDao xmlDocumentDao) {
    documentDao = documentDao;
  }
}
