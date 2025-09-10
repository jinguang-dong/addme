package defpackage;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.camera.stats.Instrumentation;
import com.google.android.apps.camera.stats.timing.CameraActivityTiming;
import com.google.android.apps.camera.ui.gridlines.gBW.mNLbzhCxd;
import com.google.android.clockwork.common.wearable.wearmaterial.list.CaNf.PJGqOKsIpSdZ;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mhy implements mhx {
    private final File b = new File("/sdcard/camera_test_score/");
    private final Instrumentation c;

    public mhy(Instrumentation instrumentation) {
        this.c = instrumentation;
    }

    final int b(mej mejVar) {
        Instrumentation instrumentation = this.c;
        if (!instrumentation.e(CameraActivityTiming.class)) {
            ((sgt) a.c().M(4789)).s("No CameraActivitySession has recorded.");
            return 0;
        }
        CameraActivityTiming cameraActivityTiming = (CameraActivityTiming) instrumentation.a(CameraActivityTiming.class);
        return (int) TimeUnit.NANOSECONDS.toMillis(cameraActivityTiming.i(mejVar) - cameraActivityTiming.m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r3v8, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r5v2, types: [sgt, shi] */
    @Override // defpackage.mhx
    public final void a(Intent intent) throws JSONException, IOException {
        sbp sbpVarG;
        rwc rwcVarJ;
        rwc rwcVarJ2;
        JSONObject jSONObject;
        JSONArray jSONArray;
        int iB;
        Bundle extras = intent.getExtras();
        if (extras == null) {
            ((sgt) a.c().M(4793)).s("Intent needs some extra parameters");
        }
        String string = extras.getString("com.google.android.apps.camera.testing.prod.scoreprint.SCORE_TYPE");
        if (string == null) {
            ((sgt) mhx.a.c().M(4788)).s(mNLbzhCxd.ySFrJUN);
            int i = sbp.d;
            sbpVarG = sex.a;
        } else {
            try {
                int i2 = sbp.d;
                sbk sbkVar = new sbk();
                Iterator it = rwr.c(",").d(string).iterator();
                while (it.hasNext()) {
                    sbkVar.h((mhw) Enum.valueOf(mhw.class, (String) it.next()));
                }
                sbpVarG = sbkVar.g();
            } catch (IllegalArgumentException e) {
                ((sgt) ((sgt) mhx.a.c().i(e)).M((char) 4787)).v(PJGqOKsIpSdZ.MgtJN, string);
                int i3 = sbp.d;
                sbpVarG = sex.a;
            }
        }
        if (!sbpVarG.isEmpty()) {
            String string2 = extras.getString("com.google.android.apps.camera.testing.prod.scoreprint.OUT_FILE_NAME");
            if (string2 == null) {
                ((sgt) mhx.a.c().M(4786)).s("No file name given");
                rwcVarJ = rvk.a;
            } else {
                rwcVarJ = rwc.j(string2);
            }
            if (rwcVarJ.h()) {
                if (!((String) rwcVarJ.c()).contains(File.separator)) {
                    File file = new File(this.b, (String) rwcVarJ.c());
                    if (!file.exists()) {
                        rwcVarJ2 = rvk.a;
                    } else {
                        try {
                            rwcVarJ2 = rwc.j(new String(rup.i(file)));
                        } catch (IOException e2) {
                            throw new RuntimeException(e2);
                        }
                    }
                    if (!rwcVarJ2.h()) {
                        jSONObject = new JSONObject();
                    } else {
                        try {
                            jSONObject = new JSONObject((String) rwcVarJ2.c());
                        } catch (JSONException e3) {
                            ((sgt) ((sgt) a.c().i(e3)).M((char) 4791)).v("Invalid JSON data: %s", rwcVarJ2.c());
                            jSONObject = new JSONObject();
                        }
                    }
                    try {
                        sgk it2 = sbpVarG.iterator();
                        while (it2.hasNext()) {
                            mhw mhwVar = (mhw) it2.next();
                            String strName = mhwVar.name();
                            try {
                                jSONArray = jSONObject.getJSONArray(strName);
                            } catch (JSONException e4) {
                                ((sgt) ((sgt) a.b().i(e4)).M((char) 4790)).v("The value is not an array: %s", jSONObject);
                                jSONArray = new JSONArray();
                            }
                            int iOrdinal = mhwVar.ordinal();
                            if (iOrdinal != 0) {
                                if (iOrdinal == 1) {
                                    iB = b(mej.ACTIVITY_SHUTTER_BUTTON_ENABLED);
                                } else {
                                    throw new RuntimeException(null, null);
                                }
                            } else {
                                iB = b(mej.ACTIVITY_FIRST_PREVIEW_FRAME_RENDERED);
                            }
                            jSONArray.put(iB);
                            jSONObject.put(strName, jSONArray);
                        }
                        String string3 = jSONObject.toString();
                        File parentFile = file.getParentFile();
                        rnt.x(parentFile);
                        parentFile.mkdirs();
                        try {
                            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
                            try {
                                bufferedWriter.write(string3);
                                bufferedWriter.newLine();
                                bufferedWriter.close();
                                return;
                            } finally {
                            }
                        } catch (IOException e5) {
                            throw new RuntimeException(e5);
                        }
                    } catch (JSONException e6) {
                        throw new RuntimeException(e6);
                    }
                }
            }
            ((sgt) a.b().M(4792)).v("Wrong file name: %s", rwcVarJ);
        }
    }
}
