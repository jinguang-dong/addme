package defpackage;

import android.location.Location;
import android.media.MediaCodec;
import android.util.Log;
import android.view.Surface;
import java.io.FileDescriptor;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ozu implements oyo {
    public final syw a;
    public final ozp b;
    public final ozo c;
    public oxm d;
    public oxp e;
    public syu h;
    public Location i;
    public Surface j;
    public ges k;
    public long f = 0;
    public int g = 0;
    public int l = 6;

    public ozu(ozp ozpVar, syw sywVar, ozo ozoVar) {
        this.a = sywVar;
        this.b = ozpVar;
        this.c = ozoVar;
    }

    @Override // defpackage.oyo
    public final /* bridge */ /* synthetic */ oyn a() {
        if (this.h != null) {
            return new ozv(this);
        }
        throw new IllegalArgumentException("Either Output video file path or descriptor is required");
    }

    @Override // defpackage.oyo
    public final void b(oxm oxmVar) {
        this.d = oxmVar;
    }

    @Override // defpackage.oyo
    public final void c(oyc oycVar) {
        oyc oycVar2 = oyc.SURFACE;
        if (oycVar == oycVar2) {
            return;
        }
        throw new IllegalArgumentException("Only " + String.valueOf(oycVar2) + " is supported for ozv, but we get " + oycVar.toString());
    }

    @Override // defpackage.oyo
    public final void d(int i) {
        throw new UnsupportedOperationException("Color standard is not supported, please use VideoRecorderMediaCodec");
    }

    @Override // defpackage.oyo
    public final void e(Surface surface) {
        this.j = surface;
    }

    @Override // defpackage.oyo
    public final void f(Location location) {
        this.i = location;
    }

    @Override // defpackage.oyo
    public final void g(syu syuVar) {
        try {
            rwc rwcVar = (rwc) ((swn) syuVar).s();
            if (rwcVar.h()) {
                this.i = (Location) rwcVar.c();
            }
        } catch (InterruptedException | ExecutionException e) {
            Log.w("VidRecMedRec", "Failed to set the location, Ignoring.", e);
        }
    }

    @Override // defpackage.oyo
    public final void h(long j) {
        this.f = j;
    }

    @Override // defpackage.oyo
    public final void j(MediaCodec.Callback callback) {
        throw new UnsupportedOperationException("Cannot add a MediaCodec's callback with VideoRecorderMediaRecorder, please use VideoRecorderMediaCodec");
    }

    @Override // defpackage.oyo
    public final void k() {
        throw new UnsupportedOperationException("Cannot apply synchronous mode with VideoRecorderMediaRecorder, please use VideoRecorderMediaCodec");
    }

    @Override // defpackage.oyo
    public final void l(int i) {
        this.g = i;
    }

    @Override // defpackage.oyo
    public final void m(syu syuVar) {
        this.h = syuVar;
    }

    @Override // defpackage.oyo
    public final void n(FileDescriptor fileDescriptor) {
        this.h = ske.M(fileDescriptor);
    }

    @Override // defpackage.oyo
    public final void o(oxp oxpVar) {
        this.e = oxpVar;
    }

    @Override // defpackage.oyo
    public final void p(int i) {
        this.l = i;
    }

    @Override // defpackage.oyo
    public final void q(ges gesVar) {
        this.k = gesVar;
    }

    @Override // defpackage.oyo
    public final void i(long j) {
    }
}
