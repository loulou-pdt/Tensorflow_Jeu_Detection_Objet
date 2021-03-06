package org.tensorflow.demo;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Trace;

import org.tensorflow.Graph;
import org.tensorflow.Operation;
import org.tensorflow.contrib.android.TensorFlowInferenceInterface;
import org.tensorflow.demo.env.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Vector;

public class DetectionLabel {
  //private String LabelsSearched[];
  private List<String> LabelsSearched;
  //private Boolean LabelsDetected[];

  public DetectionLabel(List<String> labelsSearched) {

    LabelsSearched = labelsSearched;

  }

  /*public void setLabelsDetected(Boolean[] labelsDetected) {

    LabelsDetected = labelsDetected;
  }*/

  public List<String> getLabelsSearched() {

    return LabelsSearched;
  }

  public void setLabelsSearched(List<String> labelsSearched) {
    LabelsSearched = labelsSearched;
  }

 /* public Boolean[] getLabelsDetected() {
    return LabelsDetected;
  }*/

  public DetectionLabel() {
    //LabelsDetected = new Boolean[]{false,false,false,false};
   // LabelsSearched = new String[]{"bottle","laptop","person","chair"};
      List<String> LabelsSearched = new ArrayList<>();
      LabelsSearched.add("bottle");
      LabelsSearched.add("laptop");
      LabelsSearched.add("person");
      LabelsSearched.add("chair");
  }
}
