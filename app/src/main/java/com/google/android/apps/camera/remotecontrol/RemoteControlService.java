package com.google.android.apps.camera.remotecontrol;

import android.app.Service;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.vr.audio.Cf.qcjAcSmlN;
import defpackage.cyn;
import defpackage.cyo;
import defpackage.ebn;
import defpackage.gzo;
import defpackage.hbc;
import defpackage.hbj;
import defpackage.ink;
import defpackage.jgj;
import defpackage.jhm;
import defpackage.lpb;
import defpackage.lpd;
import defpackage.lpf;
import defpackage.lph;
import defpackage.nvf;
import defpackage.rnt;
import defpackage.rrb;
import defpackage.sgt;
import defpackage.sgv;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class RemoteControlService extends Service {
    public static final sgv a = sgv.g("com.google.android.apps.camera.remotecontrol.RemoteControlService");
    public jgj b;
    public int d;
    public hbc e;
    public lpd f;
    public hbj h;
    private PackageManager i;
    private cyo k;
    private int j = Integer.MIN_VALUE;
    public nvf g = null;
    public boolean c = false;
    private final ServiceConnection l = new rrb(this, 1);
    private final lpb m = new lpb(this);

    protected final synchronized hbc a() {
        if (this.e == null) {
            Object applicationContext = getApplicationContext();
            applicationContext.getClass();
            ((lpf) ((ink) applicationContext).d(lpf.class)).s(this);
        }
        return this.e;
    }

    public final synchronized lpd b() {
        if (this.f == null) {
            Object applicationContext = getApplicationContext();
            applicationContext.getClass();
            ((lpf) ((ink) applicationContext).d(lpf.class)).s(this);
        }
        return this.f;
    }

    public final void d(boolean z) {
        nvf nvfVar;
        if (!this.c || (nvfVar = this.g) == null) {
            return;
        }
        try {
            if (z) {
                nvfVar.B(1, nvfVar.a());
            } else {
                nvfVar.B(2, nvfVar.a());
            }
        } catch (RemoteException e) {
            ((sgt) a.b().M(4300)).s("Error when calling into Photos service");
            e.printStackTrace();
        }
    }

    public final boolean e() {
        int callingUid = Binder.getCallingUid();
        boolean z = false;
        if (!f().p(gzo.bf)) {
            ((sgt) a.b().M(4297)).s("Feature not enabled.");
            return false;
        }
        if (this.j == callingUid) {
            return true;
        }
        String[] packagesForUid = this.i.getPackagesForUid(callingUid);
        if (packagesForUid == null || packagesForUid.length == 0) {
            ((sgt) a.b().M(4295)).s("Failed to get calling package name.");
            return false;
        }
        if (a() != hbc.ENG && !new lph(this.i).a(packagesForUid[0])) {
            ((sgt) a.b().M(4296)).s("Failed to verify calling package.");
            return false;
        }
        int iCheckPermission = this.i.checkPermission("android.permission.CAMERA", packagesForUid[0]);
        int iCheckPermission2 = this.i.checkPermission("android.permission.RECORD_AUDIO", packagesForUid[0]);
        boolean z2 = this.i.checkPermission("android.permission.ACCESS_FINE_LOCATION", packagesForUid[0]) == 0 || this.i.checkPermission("android.permission.ACCESS_COARSE_LOCATION", packagesForUid[0]) == 0;
        if (iCheckPermission == 0 && iCheckPermission2 == 0 && z2) {
            z = true;
        }
        if (z) {
            this.j = callingUid;
        }
        return z;
    }

    protected final synchronized hbj f() {
        if (this.h == null) {
            Object applicationContext = getApplicationContext();
            applicationContext.getClass();
            ((lpf) ((ink) applicationContext).d(lpf.class)).s(this);
        }
        return this.h;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        if (!f().p(gzo.bf)) {
            return null;
        }
        this.j = Integer.MIN_VALUE;
        return this.m;
    }

    @Override // android.app.Service
    public final void onCreate() {
        this.i = getPackageManager();
        this.b = ((jhm) getApplication()).m;
        super.onCreate();
        this.k = cyo.a(this);
        this.d = 0;
        lpd lpdVarB = b();
        lpdVarB.a = false;
        lpdVarB.c = Integer.MIN_VALUE;
        lpdVarB.d = Float.MIN_VALUE;
        lpdVarB.e = 0L;
        lpdVarB.f = Float.MIN_VALUE;
        lpdVarB.g = 0L;
        this.f.c(true);
        Intent intent = new Intent();
        intent.setClassName("com.google.android.apps.photos", "com.google.android.apps.photos.cameraassistant.CameraAssistantService");
        bindService(intent, this.l, 1);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        ServiceConnection serviceConnection = this.l;
        rnt.x(serviceConnection);
        unbindService(serviceConnection);
        this.f.c(false);
        super.onDestroy();
    }

    public final void c(int i, boolean z) {
        ArrayList arrayList;
        Intent intent = new Intent("com.google.android.apps.camera.remotecontrol.remotekey");
        intent.putExtra("key_value", i);
        intent.putExtra("key_down", z);
        cyo cyoVar = this.k;
        synchronized (cyoVar.b) {
            String action = intent.getAction();
            String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(cyoVar.a.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            boolean z2 = (intent.getFlags() & 8) != 0;
            if (z2) {
                intent.toString();
            }
            ArrayList arrayList2 = (ArrayList) cyoVar.c.get(intent.getAction());
            if (arrayList2 != null) {
                if (z2) {
                    Objects.toString(arrayList2);
                }
                ArrayList arrayList3 = null;
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    cyn cynVar = (cyn) arrayList2.get(i2);
                    if (z2) {
                        Objects.toString(cynVar.a);
                    }
                    if (cynVar.c) {
                        arrayList = arrayList3;
                    } else {
                        arrayList = arrayList3;
                        int iMatch = cynVar.a.match(action, strResolveTypeIfNeeded, scheme, data, categories, qcjAcSmlN.WgXUXXAaNVNrEy);
                        if (iMatch >= 0) {
                            if (z2) {
                                Integer.toHexString(iMatch);
                            }
                            arrayList3 = arrayList == null ? new ArrayList() : arrayList;
                            arrayList3.add(cynVar);
                            cynVar.c = true;
                        }
                    }
                    arrayList3 = arrayList;
                }
                ArrayList arrayList4 = arrayList3;
                if (arrayList4 != null) {
                    for (int i3 = 0; i3 < arrayList4.size(); i3++) {
                        ((cyn) arrayList4.get(i3)).c = false;
                    }
                    cyoVar.d.add(new ebn(intent, arrayList4, (byte[]) null));
                    Handler handler = cyoVar.e;
                    if (!handler.hasMessages(1)) {
                        handler.sendEmptyMessage(1);
                    }
                }
            }
        }
    }
}
