package sample;


import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
 import javafx.scene.control.RadioButton;
 import javafx.scene.control.ToggleGroup;

 import java.util.InputMismatchException;


public class Controller {
    public RadioButton sidedOption2;
    public RadioButton colorOption1;
    public Label colorLabel;
    public RadioButton colorOption2;
    public RadioButton colorOption3;
    public Label sidedLabel;
    public RadioButton sidedOption1;
    public Label paperTypeLabel;
    public RadioButton paperTypeOption1;
    public RadioButton paperTypeOption2;
    public Label pageNumLabel;
    public TextField numPagesField;
    public Button okButton;
    public Label costPerPageLabel;
    public Label totalCostLabel;
    public Label errorLabel;
    public RadioButton colorOption4;
    public AnchorPane scene;
    private ToggleGroup colorGroup=new ToggleGroup();
    private ToggleGroup sidedGroup=new ToggleGroup();
    private ToggleGroup paperTypeGroup=new ToggleGroup();

    public void okButtonClicked(){
        colorOption1.setToggleGroup(colorGroup);
        colorOption2.setToggleGroup(colorGroup);
        colorOption3.setToggleGroup(colorGroup);
        colorOption4.setToggleGroup(colorGroup);

        sidedOption1.setToggleGroup(sidedGroup);
        sidedOption2.setToggleGroup(sidedGroup);

        paperTypeOption1.setToggleGroup(paperTypeGroup);
        paperTypeOption2.setToggleGroup(paperTypeGroup);

        String color="";
        String sided="";
        String paperType="";
        int numPages=0;

        if (colorGroup.getSelectedToggle()==colorOption1){
            color="greyscale";

        }
        else if(colorGroup.getSelectedToggle()==colorOption2){
            color="P1";
        }

        else if(colorGroup.getSelectedToggle()==colorOption3){
            color="P2";
        }
        else if(colorGroup.getSelectedToggle()==colorOption4){
            color="P4";
        }

        if (sidedGroup.getSelectedToggle()==sidedOption1){
            sided="single";
        }

        else if(sidedGroup.getSelectedToggle()==sidedOption2){
            sided="both";
        }

        if(paperTypeGroup.getSelectedToggle()==paperTypeOption1){
            paperType="matte";
        }

        else if(paperTypeGroup.getSelectedToggle()==paperTypeOption2){
            paperType="glossy";
        }

        try{
            numPages=Integer.parseInt(numPagesField.getText());
            if(numPages<=0){
                errorLabel.setText("You must enter a positive number");
            }

            else{
                errorLabel.setVisible(false);
                PrintJobb printOrder=new PrintJobb(color, paperType, sided, numPages);

                printOrder.determineCostPerPage();
                printOrder.determineTotalCost();

                double costPerPage=printOrder.getCostPerPage();
                double totalCost=printOrder.getTotalCost();

                String totalCostPerPage=Double.toString(costPerPage);
                String realTotalCost=Double.toString(totalCost);


                costPerPageLabel.setText(totalCostPerPage);

                totalCostLabel.setText(realTotalCost);
            }

        }
        catch(NumberFormatException e){
            errorLabel.setText("You must enter a number");
        }
        










    }

}
