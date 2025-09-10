package defpackage;

import android.hardware.HardwareBuffer;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import com.google.android.libraries.oliveoil.gl.EGLImage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jpk implements jpa {
    public qkp b;
    private final MediaFormat d;
    private qin e;
    private hvl f;
    private Surface g;
    private qim h;
    private qlm i;
    private qth j;
    private static final float[] c = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    public static final float[] a = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f};

    public jpk(MediaFormat mediaFormat) {
        MediaFormat mediaFormat2 = new MediaFormat(mediaFormat);
        this.d = mediaFormat2;
        mediaFormat2.setInteger("color-format", 2130708361);
    }

    private final synchronized void h() {
        qkp qkpVar = this.b;
        if (qkpVar != null) {
            qkpVar.close();
        }
        qim qimVar = this.h;
        if (qimVar != null) {
            qimVar.close();
        }
    }

    @Override // defpackage.jpa
    public final int a() {
        return 1;
    }

    @Override // defpackage.jpa
    public final synchronized syu b() {
        qlm qlmVar;
        h();
        qlmVar = this.i;
        return qlmVar != null ? qlmVar.a() : syq.a;
    }

    @Override // defpackage.jpa
    public final synchronized void c(qfc qfcVar, qin qinVar, qlr qlrVar, Handler handler) {
        hvl hvlVar;
        this.e = qinVar;
        synchronized (hvl.class) {
            if (hvl.b == null) {
                hvl.b = ojl.bZ("gl-guard");
            }
            hvlVar = new hvl(qinVar, hvl.b);
        }
        this.f = hvlVar;
        qlm qlmVar = new qlm(new jpf(qfcVar));
        MediaFormat mediaFormat = this.d;
        qln qlnVarC = qlmVar.c(mediaFormat);
        qlnVarC.c = handler;
        qlnVarC.d = true;
        qlnVarC.e = null;
        qlnVarC.a(qlrVar);
        qth qthVarB = qlnVarC.b();
        Surface surface = ((qli) qthVarB.b).c;
        surface.getClass();
        this.g = surface;
        this.h = qim.c(qinVar, new qmq(surface), new qfq(mediaFormat.getInteger("width"), mediaFormat.getInteger("height")));
        qlmVar.b();
        this.b = new qkp(qinVar);
        this.j = qthVarB;
        this.i = qlmVar;
    }

    @Override // defpackage.jpa
    public final synchronized boolean d() {
        return this.j != null;
    }

    @Override // defpackage.jpa
    public final float[] e() {
        return c;
    }

    @Override // defpackage.jpa
    public final synchronized void f(poj pojVar) {
        g(pojVar, new jpn(this, 1));
    }

    @Override // defpackage.jpa
    public final synchronized void g(poj pojVar, joz jozVar) {
        qim qimVar = this.h;
        qimVar.getClass();
        hvl hvlVar = this.f;
        hvlVar.getClass();
        qin qinVar = this.e;
        qinVar.getClass();
        hvk hvkVar = new hvk(hvlVar, pojVar.f());
        try {
            if (hvkVar.a != null) {
                hvk hvkVar2 = new hvk(hvlVar, new EGLImage((HardwareBuffer) hvkVar.a()));
                try {
                    qjn qjnVarB = qjn.b(qinVar, (EGLImage) hvkVar2.a());
                    try {
                        qimVar.g(new itd(4), new kap(pojVar.d(), 3)).g(qfs.a);
                        jozVar.a(qjnVarB, qimVar);
                        qjnVarB.close();
                        hvkVar2.close();
                    } finally {
                    }
                } finally {
                }
            }
            hvkVar.close();
        } finally {
        }
    }
}
