//package ua.lviv.iot.lab3;
//import ua.lviv.iot.lab3.Shoe;
//
//import java.io.*;
//import java.util.List;
//
//public class ShoeWriter{
//
//
//                public void writeToFile(final List<Shoe> houseDeviceList) throws IOException {
//                        File file = new File("D:\\programs\\shoeList.csv");
//                       if (!file.exists()){
//                                file.createNewFile();
//                            }
//
//                               try (OutputStream stream = new FileOutputStream(file);
//               PrintWriter writer = new PrintWriter(stream); ){
//
//
//
//                    for (Shoe houseDevice:houseDeviceList) {
//
//                        writer.println(houseDevice.getHeaders());
//                                        writer.println(Shoe.toCSV());
//                                        writer.println("");
//                    }
//                    writer.close();
//                }
//                catch (IOException e) {
//                               throw e;
//                }
//            }
//        }
