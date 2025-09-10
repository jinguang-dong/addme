package defpackage;

import android.location.Location;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaRecorder;
import android.util.Log;
import android.view.Surface;
import com.google.android.apps.camera.jni.facebeautification.GFS.CZAHo;
import java.io.File;
import java.io.FileDescriptor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ozv implements oyn {
    public final Object a = new Object();
    public final ozp b;
    public int c;
    public ges d;
    private final Location e;
    private final FileDescriptor f;
    private final syw g;
    private final int h;
    private final int i;

    public ozv(ozu ozuVar) throws ozn {
        int i;
        this.g = ozuVar.a;
        syu syuVar = ozuVar.h;
        FileDescriptor fileDescriptor = syuVar != null ? (FileDescriptor) ske.V(syuVar) : null;
        this.f = fileDescriptor;
        this.h = ozuVar.g;
        this.e = ozuVar.i;
        ozp ozpVar = ozuVar.b;
        this.b = ozpVar;
        int i2 = ozuVar.l;
        this.i = i2;
        ozpVar.f();
        rwc rwcVarI = rwc.i(ozuVar.j);
        oxp oxpVar = ozuVar.e;
        oxm oxmVar = ozuVar.d;
        rwc rwcVarI2 = rwc.i(fileDescriptor);
        rwc rwcVarI3 = rwc.i(null);
        rwc rwcVarI4 = rwc.i(ozuVar.i);
        int i3 = ozuVar.g;
        long j = ozuVar.f;
        ozpVar.f();
        if (rwcVarI2.h()) {
            ozpVar.u((FileDescriptor) rwcVarI2.c());
        } else {
            if (!rwcVarI3.h()) {
                Log.e("MedRecPrep", "Either output file path or descriptor should present");
                throw new IllegalArgumentException("Either output file path or descriptor should present");
            }
            ozpVar.v(((File) rwcVarI3.c()).getAbsolutePath());
        }
        if (rwcVarI.h()) {
            ozpVar.n((Surface) rwcVarI.c());
        }
        if (oxmVar != null) {
            if (i2 == 0) {
                throw null;
            }
            ozpVar.l(i2 != 2 ? 5 : 1);
        }
        ozpVar.D();
        ozpVar.w(oxpVar.a.d);
        ozpVar.x(oxpVar.e);
        int i4 = oxpVar.f;
        if (i4 != -1 && (i = oxpVar.g) != -1) {
            MediaRecorder mediaRecorderA = ozpVar.a();
            int[] iArr = nvr.a;
            mediaRecorderA.setVideoEncodingProfileLevel(i4, i);
        }
        oxpVar.b.toString();
        oxj oxjVar = oxpVar.b;
        ozpVar.A(oxjVar.c().a, oxjVar.c().b);
        oxpVar.b();
        ozpVar.y(oxpVar.b());
        oxpVar.c();
        ozpVar.z(oxpVar.c());
        oxpVar.a();
        ozpVar.m(oxpVar.a());
        if (oxmVar != null) {
            ozpVar.j(oxmVar.b);
            ozpVar.h(oxmVar.e);
            ozpVar.k(oxmVar.c);
            oxmVar.a.toString();
            ozpVar.i(oxmVar.a.g);
        }
        if (rwcVarI4.h()) {
            ozpVar.o((float) ((Location) rwcVarI4.c()).getLatitude(), (float) ((Location) rwcVarI4.c()).getLongitude());
        }
        ozpVar.t(i3);
        if (j > 0) {
            ozpVar.p(j);
        }
        try {
            ozpVar.d();
            ozpVar.r(new ozt(ozuVar));
            ges gesVar = ozuVar.k;
            if (gesVar != null) {
                this.d = gesVar;
            }
            this.c = 1;
        } catch (ozn e) {
            Log.e("MedRecPrep", "immediateFailedFuture: MediaRecorder.prepare() exception: ".concat(e.toString()));
            throw e;
        }
    }

    @Override // defpackage.oyn
    public final int a() {
        return this.h;
    }

    @Override // defpackage.oyn
    public final rwc b() {
        rwc rwcVarI;
        synchronized (this.a) {
            rnt.L(this.c != 3);
            rwcVarI = rwc.i(this.b.b());
        }
        return rwcVarI;
    }

    @Override // defpackage.oyn
    public final rwc c() {
        return rwc.i(this.e);
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.a) {
            if (this.c == 3) {
                Log.w("VidRecMedRec", "Already stopped");
                return;
            }
            try {
                this.b.C();
                ges gesVar = this.d;
                if (gesVar != null) {
                    gesVar.c();
                }
            } catch (ozn unused) {
                Log.e("VidRecMedRec", "Fails to stop mediarecorder. Perhaps the recording is too short");
            }
            this.c = 3;
        }
    }

    @Override // defpackage.oyn
    public final rwc d(String str) {
        return rvk.a;
    }

    @Override // defpackage.oyn
    public final rwc e() {
        throw new UnsupportedOperationException("Unsupported operation, please use VideoRecorderMediaCodec instead");
    }

    @Override // defpackage.oyn
    public final syu f() {
        throw new UnsupportedOperationException("fast shutdown is not supported, please use VideoRecorderMediaCodec");
    }

    @Override // defpackage.oyn
    public final syu g(oyk oykVar) {
        return this.g.submit(new ozr(this, oykVar));
    }

    @Override // defpackage.oyn
    public final syu h() {
        return this.g.submit(new ozs(this, 0));
    }

    @Override // defpackage.oyn
    public final void i(long j) {
        throw new UnsupportedOperationException("Not supported operation, please use VideoRecorderMediaCodec instead");
    }

    @Override // defpackage.oyn
    public final void j(int i) {
        throw new UnsupportedOperationException("Not supported operation, please use VideoRecorderMediaCodec instead");
    }

    @Override // defpackage.oyn
    public final void k(MediaFormat mediaFormat) {
        throw new UnsupportedOperationException("Not supported operation, please use VideoRecorderMediaCodec instead");
    }

    @Override // defpackage.oyn
    public final void m(int i, MediaCodec.BufferInfo bufferInfo) {
        throw new UnsupportedOperationException("Not supported operation, please use VideoRecorderMediaCodec instead");
    }

    @Override // defpackage.oyn
    public final void n(poj pojVar, long j, boolean z) {
        throw new UnsupportedOperationException("Not supported operation, please use VideoRecorderMediaCodec instead");
    }

    @Override // defpackage.oyn
    public final void o(Object obj) {
        throw new UnsupportedOperationException("Not supported operation, please use VideoRecorderMediaCodec instead");
    }

    @Override // defpackage.oyn
    public final void p() {
        this.g.submit(new ozi(this, 2));
    }

    @Override // defpackage.oyn
    public final void q() {
        this.g.submit(new ozi(this, 3));
    }

    @Override // defpackage.oyn
    public final void r(float f) {
        throw new UnsupportedOperationException("changeBitrate is not supported, please use VideoRecorderMediaCodec");
    }

    @Override // defpackage.oyn
    public final void l(FileDescriptor fileDescriptor) {
        synchronized (this.a) {
            int i = this.c;
            boolean z = true;
            if (i != 2 && i != 4) {
                z = false;
            }
            rnt.L(z);
            try {
                this.b.q(fileDescriptor);
            } catch (ozn e) {
                Log.e("VidRecMedRec", "Fail to set next file descriptor.");
                throw new IllegalStateException(CZAHo.fpkePynV, e);
            }
        }
    }
}
