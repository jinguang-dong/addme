package com.google.vr.cardboard;

import android.os.Handler;
import android.util.Log;
import android.view.Surface;
import defpackage.a;
import defpackage.qay;
import defpackage.twg;
import defpackage.twh;
import defpackage.twi;
import defpackage.twk;
import defpackage.twl;
import defpackage.twm;
import defpackage.two;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ExternalSurfaceManager {
    private static final String b = "ExternalSurfaceManager";
    public final twh a;
    private final Object c;
    private int d;
    private boolean e;
    private volatile qay f;

    public ExternalSurfaceManager(long j) {
        twh twhVar = new twh(j);
        this.c = new Object();
        this.f = new qay();
        this.d = 1;
        this.a = twhVar;
    }

    private final int a(int i, int i2, twl twlVar, boolean z) {
        int i3;
        synchronized (this.c) {
            qay qayVar = new qay(this.f);
            i3 = this.d;
            this.d = i3 + 1;
            ((HashMap) qayVar.b).put(Integer.valueOf(i3), new twk(i3, i, i2, twlVar, z));
            this.f = qayVar;
        }
        return i3;
    }

    private final void b(twm twmVar) {
        qay qayVar = this.f;
        if (this.e) {
            HashMap map = (HashMap) qayVar.b;
            if (!map.isEmpty()) {
                for (twk twkVar : map.values()) {
                    twkVar.a();
                    twmVar.a(twkVar);
                }
            }
        }
        HashMap map2 = (HashMap) qayVar.a;
        if (map2.isEmpty()) {
            return;
        }
        Iterator it = map2.values().iterator();
        while (it.hasNext()) {
            ((twk) it.next()).c(this.a);
        }
    }

    public static native void nativeCallback(long j);

    public static native void nativeUpdateSurface(long j, int i, int i2, long j2, float[] fArr);

    public void consumerAttachToCurrentGLContext() {
        this.e = true;
        HashMap map = (HashMap) this.f.b;
        if (map.isEmpty()) {
            return;
        }
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((twk) it.next()).a();
        }
    }

    public void consumerDetachFromCurrentGLContext() {
        this.e = false;
        HashMap map = (HashMap) this.f.b;
        if (map.isEmpty()) {
            return;
        }
        for (twk twkVar : map.values()) {
            if (twkVar.i) {
                twl twlVar = twkVar.b;
                if (twlVar != null) {
                    twlVar.a();
                }
                twkVar.g.detachFromGLContext();
                twkVar.i = false;
            }
        }
    }

    public void consumerUpdateManagedSurfaces() {
        b(new twg(this, 0));
    }

    public void consumerUpdateManagedSurfacesSequentially() {
        b(new twg(this, 1));
    }

    public int createExternalSurface() {
        return a(-1, -1, null, false);
    }

    public int createExternalSurfaceWithNativeCallback(int i, int i2, long j, long j2, boolean z) {
        return a(i, i2, new two(j, j2), z);
    }

    public Surface getSurface(int i) {
        Object obj = this.f.b;
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = (HashMap) obj;
        if (!map.containsKey(numValueOf)) {
            Log.e(b, a.bE(i, "Surface with ID ", " does not exist, returning null"));
            return null;
        }
        twk twkVar = (twk) map.get(numValueOf);
        if (twkVar.i) {
            return twkVar.h;
        }
        return null;
    }

    public void releaseExternalSurface(int i) {
        synchronized (this.c) {
            qay qayVar = new qay(this.f);
            Object obj = qayVar.b;
            Integer numValueOf = Integer.valueOf(i);
            twk twkVar = (twk) ((HashMap) obj).remove(numValueOf);
            if (twkVar != null) {
                ((HashMap) qayVar.a).put(numValueOf, twkVar);
                this.f = qayVar;
            } else {
                Log.e(b, a.bv(i, "Not releasing nonexistent surface ID "));
            }
        }
    }

    public void shutdown() {
        synchronized (this.c) {
            qay qayVar = this.f;
            this.f = new qay();
            Object obj = qayVar.b;
            if (!((HashMap) obj).isEmpty()) {
                Iterator it = ((HashMap) obj).entrySet().iterator();
                while (it.hasNext()) {
                    ((twk) ((Map.Entry) it.next()).getValue()).c(this.a);
                }
            }
            Object obj2 = qayVar.a;
            if (!((HashMap) obj2).isEmpty()) {
                Iterator it2 = ((HashMap) obj2).entrySet().iterator();
                while (it2.hasNext()) {
                    ((twk) ((Map.Entry) it2.next()).getValue()).c(this.a);
                }
            }
        }
    }

    public int createExternalSurface(int i, int i2, Runnable runnable, Runnable runnable2, Handler handler) {
        if (runnable == null || handler == null) {
            throw new IllegalArgumentException("Surface listener and handler must both be non-null for external Surface creation for Java callbacks.");
        }
        return a(i, i2, new twi(runnable, runnable2, handler), false);
    }

    public void consumerAttachToCurrentGLContext(Map map) {
        this.e = true;
        qay qayVar = this.f;
        if (!((HashMap) this.f.b).isEmpty()) {
            for (Integer num : ((HashMap) this.f.b).keySet()) {
                if (!map.containsKey(num)) {
                    Log.e(b, String.format("Surface %d's texture ID is not provided, abandoning attaching to current GL context.", num));
                    return;
                }
            }
        }
        if (map.isEmpty()) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            HashMap map2 = (HashMap) qayVar.b;
            if (map2.containsKey(entry.getKey())) {
                ((twk) map2.get(entry.getKey())).b(((Integer) entry.getValue()).intValue());
            } else {
                Log.e(b, String.format("Surface %d doesn't exist, skip attaching to current GL context.", entry.getKey()));
            }
        }
    }
}
