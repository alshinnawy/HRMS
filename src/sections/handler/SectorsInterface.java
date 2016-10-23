/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package sections.handler;

import senior.hrms.emps.dto.*;
import senior.hrms.emps.exceptions.*;

public interface SectorsInterface
{
	public SectorsPk addSectors(Sectors dto) throws SectorsDaoException;
        public void updateSectors(SectorsPk pk, Sectors dto) throws SectorsDaoException;
        public void deleteSectors(SectorsPk pk) throws SectorsDaoException;
        public Sectors getSectorsById(int sectorId) throws SectorsDaoException;
        public Sectors[] getAllSectors() throws SectorsDaoException;
        public Sectors[] getSectorByName(String sectorName) throws SectorsDaoException;

}