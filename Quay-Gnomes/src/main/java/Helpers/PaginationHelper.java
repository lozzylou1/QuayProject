package Helpers;

import javax.faces.model.DataModel;

public abstract class PaginationHelper {
	private int pageSize;
	private int page;
	
	public PaginationHelper(int pageSize)
	{
		this.pageSize = pageSize;
	}
	
	public abstract int getItemsCount();
	
	@SuppressWarnings("rawtypes")
	public abstract DataModel
	createPageDataModel();
	
	/**
	 * Gets the first item for the page
	 * @return firstItem
	 * 
	 */
	public int getPageFirstItem()
	{
		return page * pageSize;
	}
	
	/**
	 * Return the last item on the page
	 * 
	 * @return i
	 */
	public int getPageLastItem ()
	{
		int i = getPageFirstItem() + pageSize - 1;
		
		int count = getItemsCount() - 1;
		
		if(count > i)
		{
			i = count;
		}
		if (i < 0)
		{
			i = 0;
		}
		return i;
	}
	
	/**
	 * Checks to see if there is a next page
	 * based on current page * pagesize
	 * then addding 1 to the value
	 * 
	 * @return boolean
	 */
	public boolean isHasNextPage()
	{
		return (page + 1) * pageSize + 1 <= getItemsCount();		
	}
	
	/**
	 * If  page is greater than 0, a previous page is available
	 * 
	 * 
	 * @return boolean
	 */
	public boolean isHasPreviousPage()
	{
		return page > 0;
	}
	
	/**
	 * If a next page exists, add one to the current page
	 */
	public void nextPage() {
		if (isHasNextPage())
			page++;
	}
	
	/**
	 * If previous page exists, previous page -1
	 */
	public void previousPage(){
		if (isHasPreviousPage())
			page --;
	}
	
	/**
	 * Get the Page size
	 * 
	 * @return pageSize
	 */
	public int getPageSize() { return 
			pageSize; }
	
	/**
	 * Set the pagesize 
	 * 
	 * @param pageSize
	 */
	public void setPageSize (int pageSize) {
		this.pageSize = pageSize;
	
	}
}
