package defpackage;

import android.location.Location;
import android.media.MediaCodec;
import android.os.Handler;
import android.util.Log;
import android.view.Surface;
import java.io.FileDescriptor;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ozl implements oyo {
    public final syw a;
    public final pbn b;
    public oxm c;
    public oxp d;
    public int f;
    public final Handler i;
    public syu m;
    public Surface t;
    public MediaCodec.Callback u;
    public ply v;
    public ges x;
    public oyc e = oyc.SURFACE;
    public int g = 1;
    public int h = 3;
    public int y = 6;
    public long j = 4000000000L;
    public syu k = ske.M(0L);
    public int l = 0;
    public oyg n = new oyb();
    public final List o = new ArrayList();
    public boolean p = false;
    public boolean q = false;
    public boolean r = true;
    public syu s = ske.M(rvk.a);
    public boolean w = false;

    public ozl(syw sywVar, Handler handler, pbn pbnVar) {
        this.a = sywVar;
        this.i = handler;
        this.b = pbnVar;
    }

    @Override // defpackage.oyo
    public final /* bridge */ /* synthetic */ oyn a() {
        if (this.m != null) {
            return new ozk(this);
        }
        throw new IllegalArgumentException("Either output video file path or descriptor is required");
    }

    @Override // defpackage.oyo
    public final void b(oxm oxmVar) {
        this.c = oxmVar;
    }

    @Override // defpackage.oyo
    public final void c(oyc oycVar) {
        this.e = oycVar;
    }

    @Override // defpackage.oyo
    public final void d(int i) {
        this.f = i;
    }

    @Override // defpackage.oyo
    public final void e(Surface surface) {
        oyc oycVar = this.e;
        oyc oycVar2 = oyc.SURFACE;
        if (oycVar != oycVar2) {
            Log.w("VidRMedCodBdr", "colorformat will be set to SURFACE as a surface is provided");
            this.e = oycVar2;
        }
        this.t = surface;
    }

    @Override // defpackage.oyo
    public final void f(Location location) {
        this.s = ske.M(rwc.j(location));
    }

    @Override // defpackage.oyo
    public final void g(syu syuVar) {
        this.s = syuVar;
    }

    @Override // defpackage.oyo
    public final void h(long j) {
        this.k = ske.M(Long.valueOf(j));
    }

    @Override // defpackage.oyo
    public final void i(long j) {
        this.j = j;
    }

    @Override // defpackage.oyo
    public final void j(MediaCodec.Callback callback) {
        this.u = callback;
    }

    @Override // defpackage.oyo
    public final void l(int i) {
        this.l = i;
    }

    @Override // defpackage.oyo
    public final void m(syu syuVar) {
        this.m = syuVar;
    }

    @Override // defpackage.oyo
    public final void n(FileDescriptor fileDescriptor) {
        this.m = ske.M(fileDescriptor);
    }

    @Override // defpackage.oyo
    public final void o(oxp oxpVar) {
        this.d = oxpVar;
    }

    @Override // defpackage.oyo
    public final void p(int i) {
        this.y = i;
    }

    @Override // defpackage.oyo
    public final /* synthetic */ void q(ges gesVar) {
        this.x = gesVar;
    }

    public final syu r() {
        syu syuVar = this.m;
        return syuVar != null ? syuVar : ske.M(null);
    }

    public final void s(oyz oyzVar) {
        this.o.add(oyzVar);
    }

    @Override // defpackage.oyo
    public final void k() {
    }
}
