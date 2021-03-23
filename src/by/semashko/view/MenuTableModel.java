package by.semashko.view;

import by.semashko.model.Menu;
import by.semashko.repository.MenuRepository;

import javax.swing.table.AbstractTableModel;

public class MenuTableModel extends AbstractTableModel {
    private int column = 3;
    private int row = 5;
    private MenuRepository menuRepository = new MenuRepository();
    private Menu menu;

    public MenuTableModel() {
       menu = new Menu(menuRepository.create());
    }

    @Override
    public int getRowCount() {
        return row;
    }

    @Override
    public int getColumnCount() {
        return column;
    }

    @Override
    public String getColumnName(int column) {
        return switch (column) {
            case 0 -> "Продукт";
            case 1 -> "Вес";
            case 2 -> "Процент";
            default -> "";
        };
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return switch (columnIndex) {
            case 0 -> menu.getProducts().get(rowIndex).getTitle();
            case 1 -> menu.getProducts().get(rowIndex).getWeight();
            case 2 -> menu.getProducts().get(rowIndex).getPercent();
            default -> throw new IllegalStateException("Unexpected value: " + columnIndex);
        };
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        super.setValueAt(aValue, rowIndex, columnIndex);
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public MenuRepository getMenuRepository() {
        return menuRepository;
    }

    public void setMenuRepository(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
}
