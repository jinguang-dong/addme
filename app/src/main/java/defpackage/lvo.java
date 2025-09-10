package defpackage;

import com.google.android.apps.camera.facemetadata.conversions.jni.HM.oUZhwRhE;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lvo {
    private static final sgv a = sgv.g("lvo");
    private static final EnumMap b = new EnumMap(pka.class);

    public static String b(pka pkaVar) {
        int iOrdinal = pkaVar.ordinal();
        if (iOrdinal == 0) {
            return "pref_camera_picturesize_front_key";
        }
        if (iOrdinal == 1) {
            return "pref_camera_picturesize_back_key";
        }
        ((sgt) a.c().M(4454)).v("Unsupported facing value: %s", pkaVar);
        return null;
    }

    private static int c(List list, int i) {
        int i2 = 0;
        int i3 = Integer.MAX_VALUE;
        int i4 = 0;
        while (i2 < list.size()) {
            pas pasVar = (pas) list.get(i2);
            int iAbs = Math.abs((pasVar.a * pasVar.b) - i);
            int i5 = iAbs < i3 ? iAbs : i3;
            if (iAbs < i3) {
                i4 = i2;
            }
            i2++;
            i3 = i5;
        }
        return i4;
    }

    public static pas a(String str, List list, pka pkaVar) {
        lvn lvnVar;
        if ("1836x3264".equals(str)) {
            return lvm.a;
        }
        ArrayList arrayList = new ArrayList(list);
        EnumMap enumMap = b;
        if (enumMap.get(pkaVar) != null) {
            lvnVar = (lvn) enumMap.get(pkaVar);
        } else {
            lvn lvnVar2 = new lvn();
            Collections.sort(arrayList, new cbi(9));
            lvnVar2.a = (pas) arrayList.remove(0);
            pas pasVar = lvnVar2.a;
            float f = pasVar.a;
            float f2 = pasVar.b;
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                pas pasVar2 = (pas) arrayList.get(i);
                if (Math.abs((pasVar2.a / pasVar2.b) - (f / f2)) < 0.01d) {
                    arrayList2.add(pasVar2);
                }
            }
            if (arrayList2.size() >= 2) {
                arrayList = arrayList2;
            }
            if (arrayList.isEmpty()) {
                ((sgt) a.c().M(4457)).s("Only one supported resolution.");
                pas pasVar3 = lvnVar2.a;
                lvnVar2.b = pasVar3;
                lvnVar2.c = pasVar3;
            } else if (arrayList.size() == 1) {
                ((sgt) a.c().M(4456)).s("Only two supported resolutions.");
                lvnVar2.b = (pas) arrayList.get(0);
                lvnVar2.c = (pas) arrayList.get(0);
            } else if (arrayList.size() == 2) {
                ((sgt) a.c().M(4455)).s("Exactly three supported resolutions.");
                lvnVar2.b = (pas) arrayList.get(0);
                lvnVar2.c = (pas) arrayList.get(1);
            } else {
                pas pasVar4 = lvnVar2.a;
                float f3 = pasVar4.a * pasVar4.b;
                int iC = c(arrayList, (int) (0.5f * f3));
                int iC2 = c(arrayList, (int) (f3 * 0.25f));
                if (((pas) arrayList.get(iC)).equals(arrayList.get(iC2))) {
                    if (iC2 < arrayList.size() - 1) {
                        iC2++;
                    } else {
                        iC--;
                    }
                }
                lvnVar2.b = (pas) arrayList.get(iC);
                lvnVar2.c = (pas) arrayList.get(iC2);
            }
            enumMap.put((EnumMap) pkaVar, (pka) lvnVar2);
            lvnVar = lvnVar2;
        }
        lvnVar.getClass();
        if ("large".equals(str)) {
            return lvnVar.a;
        }
        if ("medium".equals(str)) {
            return lvnVar.b;
        }
        if (oUZhwRhE.GVfrvJWleLqdW.equals(str)) {
            return lvnVar.c;
        }
        if (str != null && str.split("x").length == 2) {
            pas pasVarBL = ojl.bL(str);
            if (list.contains(pasVarBL)) {
                return pasVarBL;
            }
        }
        return lvnVar.a;
    }
}
