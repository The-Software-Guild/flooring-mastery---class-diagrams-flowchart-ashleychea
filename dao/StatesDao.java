package dao;

import dto.State;
public interface StatesDao {
    State getState(String stateAbbr) throws DataPersistenceException;
}
