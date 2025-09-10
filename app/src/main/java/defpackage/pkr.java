package defpackage;

import android.media.ImageReader;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pkr implements pom {
    public final Object a;
    private final /* synthetic */ int b;

    public pkr(pnp pnpVar, int i) {
        this.b = i;
        this.a = pnpVar;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, pom] */
    @Override // defpackage.pom
    public final poo a(pol polVar) {
        if (this.b == 0) {
            return new pkj(new pkq(new pjl(this.a.a(polVar))));
        }
        ImageReader.Builder builder = new ImageReader.Builder(polVar.a, polVar.b);
        int i = polVar.c;
        if (i != -1) {
            builder.setImageFormat(i);
        }
        int i2 = polVar.d;
        if (i2 != -1) {
            builder.setMaxImages(i2);
        }
        long j = polVar.e;
        if (j != -1) {
            builder.setUsage(j);
        }
        int i3 = polVar.f;
        if (i3 != -1) {
            builder.setDefaultHardwareBufferFormat(i3);
        }
        return new pje(builder.build());
    }

    public pkr(pom pomVar, int i) {
        this.b = i;
        this.a = pomVar;
    }
}
