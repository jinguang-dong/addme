package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.media.MediaActionSound;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class emd extends ene {
    public static final eny a = new eny("AndCam2AgntImp");
    public final emb b;
    public final ent c;
    public final enu d;
    public final CameraManager e;
    public final MediaActionSound f;
    public enr g;
    public final List h;
    private final HandlerThread j;
    private int k;

    public emd(Context context) throws CameraAccessException {
        HandlerThread handlerThread = new HandlerThread("Camera2 Handler Thread");
        this.j = handlerThread;
        handlerThread.start();
        emb embVar = new emb(this, handlerThread.getLooper());
        this.b = embVar;
        this.g = new enr(embVar);
        this.c = new ent();
        enu enuVar = new enu(embVar, handlerThread);
        this.d = enuVar;
        enuVar.start();
        this.e = (CameraManager) context.getSystemService("camera");
        MediaActionSound mediaActionSound = new MediaActionSound();
        this.f = mediaActionSound;
        mediaActionSound.load(0);
        this.k = 0;
        this.h = new ArrayList();
        h();
    }

    private final void h() throws CameraAccessException {
        List list;
        try {
            String[] cameraIdList = this.e.getCameraIdList();
            HashSet hashSet = new HashSet(Arrays.asList(cameraIdList));
            int i = 0;
            while (true) {
                list = this.h;
                if (i >= list.size()) {
                    break;
                }
                if (!hashSet.contains(list.get(i))) {
                    list.set(i, null);
                    this.k--;
                }
                i++;
            }
            hashSet.removeAll(list);
            for (String str : cameraIdList) {
                if (hashSet.contains(str)) {
                    list.add(str);
                    this.k++;
                }
            }
        } catch (CameraAccessException e) {
            enz.b(a, "Could not get device listing from camera subsystem", e);
        }
    }

    @Override // defpackage.ene
    public final Handler a() {
        return this.b;
    }

    @Override // defpackage.ene
    public final enn b() throws CameraAccessException {
        h();
        return new elt(this.e, (String[]) this.h.toArray(new String[0]));
    }

    @Override // defpackage.ene
    public final enr c() {
        return this.g;
    }

    @Override // defpackage.ene
    protected final ent d() {
        return this.c;
    }

    @Override // defpackage.ene
    public final enu e() {
        return this.d;
    }

    @Override // defpackage.ene
    public final void f(enr enrVar) {
        this.g = enrVar;
    }
}
