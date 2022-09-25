import javax.swing.table.DefaultTableModel;

public class MyTableModel extends DefaultTableModel {
    public MyTableModel(int rowCount, int columnCount) {
        super(rowCount, columnCount);
    }
    public MyTableModel(Object[][] data, Object[]columnnames){
        super(data, columnnames);
    }
    @Override
    public Class<?> getColumnClass(int columnindex){
        return columnindex == 0 ? Boolean.class : String.class;
    }
}
