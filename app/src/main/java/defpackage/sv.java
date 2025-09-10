package defpackage;

import android.content.pm.PackageManager;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sv {
    public final uem a;
    public final und b;
    public final Object c;
    public List d;
    public final qrh e;
    private final int f;

    /* JADX WARN: Type inference failed for: r7v6, types: [boolean, int] */
    public sv(uem uemVar, qrh qrhVar, PackageManager packageManager) throws Throwable {
        qrhVar.getClass();
        packageManager.getClass();
        this.a = uemVar;
        this.e = qrhVar;
        und undVarJ = ung.j(((ugx) qrhVar.c).plus(new unc("Camera2DeviceCache")));
        this.b = undVarJ;
        this.c = new Object();
        int iHasSystemFeature = packageManager.hasSystemFeature("android.hardware.camera");
        this.f = packageManager.hasSystemFeature("android.hardware.camera.front") ? iHasSystemFeature + 1 : iHasSystemFeature;
        urk urkVarA = urn.a(new urf(new su(this, (uhb) null, 0)));
        uti utiVar = new uti();
        utb utbVarB = ung.B(urkVarA);
        ung.C(undVarJ, utbVarB.c, utbVarB.a, usy.d(1, utbVarB.b, utbVarB.d), utiVar, usy.a);
    }

    public static final void c(uqx uqxVar, List list) {
        Objects.toString(list);
        Object objO = ukc.O(uqxVar, list);
        if (objO instanceof uqp) {
            uqq.b(objO);
            Log.e("CXCP", "Failed to send camera ID list: " + list + '!');
        }
    }

    private final boolean d(List list) {
        return list.size() >= this.f;
    }

    public final List a() {
        try {
            String[] cameraIdList = ((CameraManager) this.a.a()).getCameraIdList();
            cameraIdList.getClass();
            ArrayList arrayList = new ArrayList(cameraIdList.length);
            for (String str : cameraIdList) {
                str.getClass();
                pp.b(str);
                arrayList.add(new pp(str));
            }
            if (d(arrayList)) {
                synchronized (this.c) {
                    this.d = arrayList;
                }
                arrayList.toString();
                return arrayList;
            }
            Log.w("CXCP", "Failed to query camera ID list: Invalid list returned: " + arrayList + '.');
            return arrayList;
        } catch (CameraAccessException e) {
            Log.w("CXCP", "Failed to query CameraManager#getCameraIdList!", e);
            return null;
        }
    }

    public final void b(uqx uqxVar, String str, boolean z) {
        List list;
        synchronized (this.c) {
            list = this.d;
        }
        List listA = null;
        if (!z) {
            if (list == null) {
                list = null;
            } else if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (a.ao(((pp) it.next()).a, str)) {
                    }
                }
            }
            listA = a();
            break;
        }
        if (list == null) {
            list = null;
        } else if (!list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (a.ao(((pp) it2.next()).a, str)) {
                    break;
                }
            }
        }
        listA = a();
        if (listA != null && (d(listA) || list == null)) {
            list = listA;
        }
        if (list != null) {
            c(uqxVar, list);
        }
    }
}
