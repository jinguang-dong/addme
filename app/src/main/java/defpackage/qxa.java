package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.apps.camera.imax.cyclops.audio.xcIh.cdVQ;
import com.google.android.apps.camera.modeldownloader.uD.uCzt;
import com.google.android.build.data.JKx.wzgaYJqO;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qxa {
    private static volatile rwc a;

    private qxa() {
    }

    public static rwc a(Context context) {
        rwc rwcVar;
        rwc rwcVarJ;
        rwc rwcVarJ2;
        rwc rwcVar2 = a;
        if (rwcVar2 != null) {
            return rwcVar2;
        }
        synchronized (qxa.class) {
            rwcVar = a;
            if (rwcVar == null) {
                String str = Build.TYPE;
                String str2 = Build.TAGS;
                int i = qxc.a;
                if ((str.equals("eng") || str.equals(wzgaYJqO.PCp)) && (str2.contains("dev-keys") || str2.contains("test-keys"))) {
                    Context contextA = prt.a(context);
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        StrictMode.allowThreadDiskWrites();
                        try {
                            File file = new File(contextA.getDir("phenotype_hermetic", 0), cdVQ.OOp);
                            rwcVarJ = file.exists() ? rwc.j(file) : rvk.a;
                        } catch (RuntimeException e) {
                            Log.e("HermeticFileOverrides", "no data dir", e);
                            rwcVarJ = rvk.a;
                        }
                        if (rwcVarJ.h()) {
                            Object objC = rwcVarJ.c();
                            try {
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream((File) objC)));
                                try {
                                    aaa aaaVar = new aaa();
                                    HashMap map = new HashMap();
                                    while (true) {
                                        String line = bufferedReader.readLine();
                                        if (line == null) {
                                            break;
                                        }
                                        String[] strArrSplit = line.split(" ", 3);
                                        if (strArrSplit.length != 3) {
                                            Log.e("HermeticFileOverrides", mn.g(line, uCzt.LaTc));
                                        } else {
                                            String str3 = new String(strArrSplit[0]);
                                            String strDecode = Uri.decode(new String(strArrSplit[1]));
                                            String strDecode2 = (String) map.get(strArrSplit[2]);
                                            if (strDecode2 == null) {
                                                String str4 = new String(strArrSplit[2]);
                                                strDecode2 = Uri.decode(str4);
                                                if (strDecode2.length() < 1024 || strDecode2 == str4) {
                                                    map.put(str4, strDecode2);
                                                }
                                            }
                                            aaa aaaVar2 = (aaa) aaaVar.get(str3);
                                            if (aaaVar2 == null) {
                                                aaaVar2 = new aaa();
                                                aaaVar.put(str3, aaaVar2);
                                            }
                                            aaaVar2.put(strDecode, strDecode2);
                                        }
                                    }
                                    Log.w("HermeticFileOverrides", "Parsed " + objC.toString() + " for Android package " + contextA.getPackageName());
                                    qaq qaqVar = new qaq(aaaVar);
                                    bufferedReader.close();
                                    rwcVarJ2 = rwc.j(qaqVar);
                                } catch (Throwable th) {
                                    try {
                                        bufferedReader.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            } catch (IOException e2) {
                                throw new RuntimeException(e2);
                            }
                        } else {
                            rwcVarJ2 = rvk.a;
                        }
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    } catch (Throwable th3) {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        throw th3;
                    }
                } else {
                    rwcVarJ2 = rvk.a;
                }
                rwcVar = rwcVarJ2;
                a = rwcVar;
            }
        }
        return rwcVar;
    }
}
