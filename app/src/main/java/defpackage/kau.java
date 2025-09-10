package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kau implements kao {
    private static final sgv a = sgv.g("kau");
    private final MediaFormat b;
    private final qin c;
    private jyw d = null;

    public kau(MediaFormat mediaFormat, qin qinVar) {
        this.b = mediaFormat;
        this.c = qinVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [sgt, shi] */
    private final void d() {
        MediaFormat mediaFormat = this.b;
        mediaFormat.setInteger("color-format", 2130708361);
        try {
            qin qinVar = this.c;
            String string = mediaFormat.getString("mime");
            string.getClass();
            this.d = new jyy(new jyy(new jyz(new AtomicInteger(0), new jyu(MediaCodec.createEncoderByType(string), mediaFormat, qinVar, new qkp(qinVar))), 0), 1);
        } catch (IOException | RuntimeException e) {
            ((sgt) ((sgt) a.b().i(e)).M((char) 3193)).s("Could not create image encoder!");
        }
    }

    @Override // defpackage.kao
    public final MediaFormat a() {
        return this.b;
    }

    @Override // defpackage.kao
    public final synchronized jzf b(qfc qfcVar, pao paoVar, boolean z) {
        jyw jywVar;
        if (this.d == null) {
            d();
        }
        jywVar = this.d;
        jywVar.getClass();
        return new jyx(jywVar, qfcVar, z ? kbi.d : kbi.c);
    }

    @Override // defpackage.kao
    public final synchronized void c() {
        d();
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final synchronized void close() {
        jyw jywVar = this.d;
        if (jywVar != null) {
            jywVar.close();
        }
        this.c.close();
    }
}
