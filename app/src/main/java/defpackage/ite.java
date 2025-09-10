package defpackage;

import android.hardware.HardwareBuffer;
import android.location.Location;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.opengl.Matrix;
import android.view.Surface;
import com.google.android.libraries.oliveoil.gl.EGLImage;
import com.google.ar.core.ImageMetadata;
import com.google.googlex.gcam.dirtylens.PrCd.SHXc;
import java.io.FileOutputStream;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ite implements paq {
    public static final sgv a = sgv.g("ite");
    private static final float[] g = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f};
    public final ExecutorService b = ojl.bZ("resource-closing");
    public final qin c;
    public final qkp d;
    public final Surface e;
    public final qim f;
    private final pao h;
    private final Executor i;
    private final AtomicBoolean j;
    private final qlm k;

    public final synchronized syu a() {
        c();
        return this.k.b.a();
    }

    public final synchronized void b(HardwareBuffer hardwareBuffer, long j) {
        if (this.j.get()) {
            ((sgt) a.c().M(2309)).s("Shutdown already called. Skipping additional requests.");
            hardwareBuffer.close();
            return;
        }
        EGLImage eGLImage = new EGLImage(hardwareBuffer);
        try {
            qjn qjnVarB = qjn.b(this.c, eGLImage);
            try {
                qim qimVar = this.f;
                qimVar.g(new itd(0), new kap(j, 1));
                pao paoVar = this.h;
                float[] fArr = (float[]) g.clone();
                Matrix.translateM(fArr, 0, 0.5f, 0.5f, 0.0f);
                Matrix.rotateM(fArr, 0, paoVar.e, 0.0f, 0.0f, 1.0f);
                Matrix.translateM(fArr, 0, -0.5f, -0.5f, 0.0f);
                this.d.b(qjnVarB, qimVar, fArr);
                this.b.execute(new gdq((Object) this, (Object) eGLImage, (Object) hardwareBuffer, 9, (short[]) null));
                qjnVarB.close();
                eGLImage.close();
            } finally {
            }
        } finally {
        }
    }

    public final void c() {
        if (this.j.getAndSet(true)) {
            ((sgt) a.c().M(2311)).s("Shutdown already called. Skipping additional requests.");
        } else {
            this.k.a().c(new ild(this, 20), this.i);
        }
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        c();
    }

    public ite(iso isoVar, jid jidVar, Executor executor, FileOutputStream fileOutputStream, pas pasVar, pao paoVar, boolean z, int i, rwc rwcVar, rwc rwcVar2, rwc rwcVar3) {
        String str;
        int i2;
        int i3;
        Surface surfaceCreatePersistentInputSurface = MediaCodec.createPersistentInputSurface();
        this.e = surfaceCreatePersistentInputSurface;
        this.j = new AtomicBoolean(false);
        this.h = paoVar;
        int iOrdinal = paoVar.ordinal();
        pasVar = (iOrdinal == 1 || iOrdinal == 3) ? pasVar.h() : pasVar;
        int i4 = paoVar.e;
        if (true != z) {
            str = "video/avc";
        } else {
            str = "video/hevc";
        }
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(str, pasVar.a, pasVar.b);
        if (true != z) {
            i2 = 8;
        } else {
            i2 = 1;
        }
        mediaFormatCreateVideoFormat.setInteger("profile", i2);
        if (true != z) {
            i3 = 32768;
        } else {
            i3 = ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        mediaFormatCreateVideoFormat.setInteger("level", i3);
        mediaFormatCreateVideoFormat.setInteger("bitrate", ((Integer) rwcVar2.e(38000000)).intValue());
        mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
        mediaFormatCreateVideoFormat.setInteger("frame-rate", i);
        mediaFormatCreateVideoFormat.setFloat(SHXc.hudj, ((Float) rwcVar.e(Float.valueOf(1.0f))).floatValue());
        mediaFormatCreateVideoFormat.setInteger("color-standard", ((Integer) rwcVar3.e(0)).intValue());
        qlx qlxVar = new qlx(executor);
        qlxVar.c(fileOutputStream.getFD());
        qlxVar.b(0);
        rwc rwcVarD = jidVar.d();
        if (rwcVarD.h()) {
            Location location = (Location) rwcVarD.c();
            qlxVar.b = ske.M(Float.valueOf((float) location.getLatitude()));
            qlxVar.c = ske.M(Float.valueOf((float) location.getLongitude()));
        }
        qlt qltVarA = qlxVar.a();
        ((qlu) qltVarA).g.c(new ild(fileOutputStream, 19), executor);
        qlm qlmVar = new qlm(qltVarA);
        this.k = qlmVar;
        qln qlnVarC = qlmVar.c(mediaFormatCreateVideoFormat);
        qlnVarC.d = false;
        qlnVarC.e = surfaceCreatePersistentInputSurface;
        qlnVarC.b();
        qin qinVarG = isoVar.g("glContext");
        this.c = qinVarG;
        this.d = new qkp(qinVarG);
        this.f = qim.c(qinVarG, new qkx(surfaceCreatePersistentInputSurface), new qfq(pasVar.a, pasVar.b));
        qlmVar.b();
        this.i = executor;
    }
}
