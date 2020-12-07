package com.tohandesign.data_project_mobile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import de.codecrafters.tableview.TableView;
import de.codecrafters.tableview.toolkit.SimpleTableDataAdapter;
import de.codecrafters.tableview.toolkit.SimpleTableHeaderAdapter;


public class MainActivity extends AppCompatActivity {




    public static int item314amount;
    public static int item14127amount;
    public static int item019amount;
    public static int item2142amount;
    public static int item129amount;
    public static int item1118amount;
    public static int item11495amount;
    public static int item457amount;
    public static int item062amount;
    public static int item13122amount;
    public static int item048amount;
    public static int item118amount;
    public static int item1605amount;



    public static ProductItem item457;
    public static ProductItem item062r2;
    public static ProductItem item1118;
    public static ProductItem item129;
    public static ProductItem item11495;
    public static ProductItem item13122;
    public static ProductItem item048;
    public static ProductItem item118;
    public static ProductItem item062r4;
    public static ProductItem item14127r4;
    public static ProductItem item2142;
    public static ProductItem item019;
    public static ProductItem item14127r6;
    public static ProductItem item314;
    public static ProductItem item1605;

    public static String itemnum;

    private static final String[] HeaderData =  { "","Period","1","2","3","4","5","6","7","8","9","10" };
    private static String[][] DATA_TO_SHOW = null;
    public static int[] grossreq = new int[10];


    public static String[] invHeader = {"Item", "Amount of Hand"};
    public static String[][] inv = new String[15][2];
    public static int invLine = 0;

    private Button orderbutton;

    RecyclerView recyclerView;
    final ArrayList<ProductItem> mList = new ArrayList<>();


    private SharedPreferences sp;
    private SharedPreferences.Editor editor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp = getSharedPreferences("Inventory",MODE_PRIVATE);
        editor = sp.edit();
        setItems(sp, editor);
        saveItems(item1605, sp, editor);

        printInv(item1605);
        setTable(inv,invHeader);
        invLine = 0;


        recyclerView= findViewById(R.id.cardlisterr);;
        final Adapter adapter = new Adapter(this, mList);

        final EditText grosstext1 = (EditText) findViewById(R.id.editText1);
        final EditText grosstext2 = (EditText)findViewById(R.id.editText2);
        final EditText grosstext3 = (EditText)findViewById(R.id.editText3);
        final EditText grosstext4 = (EditText)findViewById(R.id.editText4);
        final EditText grosstext5 = (EditText)findViewById(R.id.editText5);
        final EditText grosstext6 = (EditText)findViewById(R.id.editText6);
        final EditText grosstext7 = (EditText)findViewById(R.id.editText7);
        final EditText grosstext8 = (EditText)findViewById(R.id.editText8);
        final EditText grosstext9 = (EditText)findViewById(R.id.editText9);
        final EditText grosstext10 = (EditText)findViewById(R.id.editText10);

        final EditText itemnumEditText = (EditText)findViewById(R.id.itemnum);





        Button inupdate = (Button)findViewById(R.id.invupdate);
        final Button resetOrder = (Button)findViewById(R.id.resetOrder);
        orderbutton = (Button) findViewById(R.id.orderItem);
        orderbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String itemnumtext = itemnumEditText.getText().toString();
                if(!TextUtils.isEmpty(itemnumtext)){
                    mList.clear();
                    recyclerView.setAdapter(adapter);
                    if(TextUtils.isEmpty(grosstext1.getText().toString()))
                        grossreq[0] = 0;
                    else
                        grossreq[0] = Integer.parseInt(grosstext1.getText().toString());

                    if(TextUtils.isEmpty(grosstext2.getText().toString()))
                        grossreq[1] = 0;
                    else
                        grossreq[1] = Integer.parseInt(grosstext2.getText().toString());

                    if(TextUtils.isEmpty(grosstext3.getText().toString()))
                        grossreq[2] = 0;
                    else
                        grossreq[2] = Integer.parseInt(grosstext3.getText().toString());

                    if(TextUtils.isEmpty(grosstext4.getText().toString()))
                        grossreq[3] = 0;
                    else
                        grossreq[3] = Integer.parseInt(grosstext4.getText().toString());

                    if(TextUtils.isEmpty(grosstext5.getText().toString()))
                        grossreq[4] = 0;
                    else
                        grossreq[4] = Integer.parseInt(grosstext5.getText().toString());

                    if(TextUtils.isEmpty(grosstext6.getText().toString()))
                        grossreq[5] = 0;
                    else
                        grossreq[5] = Integer.parseInt(grosstext6.getText().toString());

                    if(TextUtils.isEmpty(grosstext7.getText().toString()))
                        grossreq[6] = 0;
                    else
                        grossreq[6] = Integer.parseInt(grosstext7.getText().toString());

                    if(TextUtils.isEmpty(grosstext8.getText().toString()))
                        grossreq[7] = 0;
                    else
                        grossreq[7] = Integer.parseInt(grosstext8.getText().toString());

                    if(TextUtils.isEmpty(grosstext9.getText().toString()))
                        grossreq[8] = 0;
                    else
                        grossreq[8] = Integer.parseInt(grosstext9.getText().toString());

                    if(TextUtils.isEmpty(grosstext10.getText().toString()))
                        grossreq[9] = 0;
                    else
                        grossreq[9] = Integer.parseInt(grosstext10.getText().toString());
                    ProductItem item = null;
                    boolean itemtest = true;
                    switch (Integer.parseInt(itemnumtext)) {
                        case 457:
                            item = item457;
                            break;
                        case 62:
                            //r sorcak
                            item = item062r2;
                            break;
                        case 129:
                            item = item129;
                            break;
                        case 1118:
                            item = item1118;
                            break;
                        case 11495:
                            item = item11495;
                            break;
                        case 13122:
                            item = item13122;
                            break;
                        case 48:
                            item = item048;
                            break;
                        case 118:
                            item = item118;
                            break;
                        case 14127:
                            //r
                            item = item14127r6;
                            break;
                        case 2142:
                            item = item2142;
                            break;
                        case 19:
                            item = item019;
                            break;
                        case 314:
                            item = item314;
                            break;
                        case 1605:
                            item = item1605;
                            break;
                        default:
                            itemtest = false;
                            Toast.makeText(MainActivity.this,"item not found", Toast.LENGTH_SHORT).show();
                            break;
                    }
                    if(itemtest) {
                        calculate(item, grossreq);
                        itemnumtext = "";
                        itemnumEditText.setText(itemnumtext);
                        onClick(view);
                    }

                    saveItems(item1605, sp, editor);

                    printInv(item1605);
                    setTable(inv,invHeader);
                    invLine = 0;

                    grosstext1.setText("");
                    grosstext2.setText("");
                    grosstext3.setText("");
                    grosstext4.setText("");
                    grosstext5.setText("");
                    grosstext6.setText("");
                    grosstext7.setText("");
                    grosstext8.setText("");
                    grosstext9.setText("");
                    grosstext10.setText("");



                }

            }
        });


        resetOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mList.clear();
            }
        });

        inupdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                printInv(item1605);
                setTable(inv,invHeader);
                invLine = 0;
            }
        });







        recyclerView.setAdapter(adapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);










    }

    public static void setItems(SharedPreferences sp, SharedPreferences.Editor editor){
        item314amount = sp.getInt("314", 0);
        item14127amount = sp.getInt("14127", 60);
        item019amount = sp.getInt("019", 50);
        item2142amount = sp.getInt("2142", 80);
        item129amount = sp.getInt("129", 0);
        item1118amount = sp.getInt("1118", 30);
        item11495amount = sp.getInt("11495", 120);
        item457amount = sp.getInt("457", 0);
        item062amount = sp.getInt("062", 50);
        item13122amount = sp.getInt("13122", 70);
        item048amount = sp.getInt("048", 30);
        item118amount = sp.getInt("118", 0);
        item1605amount = sp.getInt("1605", 30);



        item457 = new ProductItem("457", item457amount,20,2,2,1,1, new ProductItem[]{});
        item062r2 = new ProductItem("062", item062amount,100,6,2,1,2, new ProductItem[]{});
        item1118 = new ProductItem("1118", item1118amount,0,0,3,1,1, new ProductItem[]{});
        item129 = new ProductItem("129", item129amount,100,8,4,40,1, new ProductItem[]{});
        item11495 = new ProductItem("11495", item11495amount,0,0,1,50,1, new ProductItem[]{item129,item1118});
        item13122 = new ProductItem("13122", item13122amount,70,3,1,40,1, new ProductItem[]{item457,item062r2,item11495});
        item048 = new ProductItem("048", item048amount,0,0,3,30,1, new ProductItem[]{});
        item118 = new ProductItem("118", item118amount,50,2,2,1,1, new ProductItem[]{});
        item062r4 = new ProductItem("062", item062amount,100,6,2,1,4, new ProductItem[]{});
        item14127r4 = new ProductItem("14127", item14127amount,0,0,2,50,4, new ProductItem[]{});
        item2142 = new ProductItem("2142", item2142amount,0,0,2,100,1, new ProductItem[]{});
        item019 = new ProductItem("019", item019amount,40,5,2,50,1, new ProductItem[]{});
        item14127r6 = new ProductItem("14127", item14127amount,0,0,2,50,6, new ProductItem[]{});
        item314 = new ProductItem("314", item314amount,50,5,1,50,1, new ProductItem[]{item2142, item019, item14127r6});
        item1605 = new ProductItem("1605", item1605amount,0,0,1,1,1, new ProductItem[]{item13122,item048,item118,item062r4,item14127r4,item314});


    }


    public static void saveItems(ProductItem item, SharedPreferences sp, SharedPreferences.Editor editor){

        editor.putInt(item.getItemId(), item.getAmountOnHand());
        editor.commit();

        if(item.getChilds().length !=0) {
            for(int i = 0; i<item.getChilds().length;i++){
                saveItems(item.getChilds(i),sp,editor);
            }
        }

    }



    public static void printInv(ProductItem item){

        inv[invLine][0] = "Item id :" + item.getItemId();
        inv[invLine][1] = item.getAmountOnHand() + " pieces";
        invLine++;

        if(item.getChilds().length !=0) {
            for(int i = 0; i<item.getChilds().length;i++){
                printInv(item.getChilds(i));
            }
        }
    }


    public void calculate(ProductItem item, int[] grossReq) {
        mList.add(item);
        int[] netreq = new int[10];
        int[] scheduled = new int[10];
        int[] amofhand = new int[10];
        int[] plannedorder = new int[10];
        int[] childgrossReq = new int[10];

        amofhand[0] = item.getAmountOnHand();
        if(item.getArrivalOnWeek()!=0)
            scheduled[item.getArrivalOnWeek()-1]=item.getScheduledReceipt();

        for(int j=1;j<10;j++){



            if(amofhand[j-1]+scheduled[j-1] >= grossReq[j-1]) {
                amofhand[j] = amofhand[j - 1]+scheduled[j-1] - grossReq[j - 1];
            }else if(amofhand[j-1]+scheduled[j-1] < grossReq[j-1]) {
                netreq[j-1] = grossReq[j - 1] - amofhand[j - 1]-scheduled[j-1] ;
                plannedorder[j-1] = (int)(Math.ceil((float)netreq[j-1] / (float)item.getLotSizingRule())*item.getLotSizingRule());
                amofhand[j] = amofhand[j]+ plannedorder[j-1] + scheduled[j-1] +amofhand[j-1]- grossReq[j - 1];
            }


        }

        if(item.getChilds().length!=0){
            for(int k = 0; k<item.getChilds().length;k++){
                for(int i=0;i<plannedorder.length-1;i++){
                    childgrossReq[i]=plannedorder[i+1]*item.getChilds(k).getItemRequired();
                }
                calculate(item.getChilds(k),childgrossReq);
            }
        }

        item.setTable(item.printTable(item,grossReq,amofhand,netreq,plannedorder));
        item.setAmountOnHand(amofhand[9]);




    }

    public void setTable(String[][] data, String[] header) {

        TableView<String[]> tableView = (TableView<String[]>) findViewById(R.id.tableView);
        tableView.setColumnCount(data[0].length);
        tableView.setHeaderAdapter(new SimpleTableHeaderAdapter(this, header));
        tableView.setDataAdapter(new SimpleTableDataAdapter(this, data));
    }




}
