package defpackage;

import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.YuvImage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jzt implements ian {
    final /* synthetic */ kbz a;
    final /* synthetic */ long b;
    final /* synthetic */ poe c;
    final /* synthetic */ poj d;
    final /* synthetic */ pkf e;
    final /* synthetic */ pdk f;
    final /* synthetic */ kbq g;
    final /* synthetic */ jzv h;

    public jzt(jzv jzvVar, kbz kbzVar, long j, poe poeVar, poj pojVar, pkf pkfVar, pdk pdkVar, kbq kbqVar) {
        this.a = kbzVar;
        this.b = j;
        this.c = poeVar;
        this.d = pojVar;
        this.e = pkfVar;
        this.f = pdkVar;
        this.g = kbqVar;
        this.h = jzvVar;
    }

    @Override // defpackage.ian
    public final void a(iby ibyVar, YuvImage yuvImage, ShotMetadata shotMetadata) {
        Long lValueOf = Long.valueOf(this.b);
        syu syuVarM = ske.M(this.c);
        kbz kbzVar = this.a;
        poj pojVarA = this.h.c.a(new jzw((ltr) kbzVar.b, lValueOf, syuVarM, kbzVar.a), rup.t(yuvImage), this.d, shotMetadata);
        this.e.l();
        this.f.close();
        this.g.c(pojVarA);
    }
}
