package defpackage;

import android.hardware.HardwareBuffer;
import com.google.googlex.gcam.ShotMetadata;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jzs implements iaf {
    final /* synthetic */ kbz a;
    final /* synthetic */ long b;
    final /* synthetic */ poe c;
    final /* synthetic */ pkf d;
    final /* synthetic */ pdk e;
    final /* synthetic */ kbq f;
    final /* synthetic */ jzv g;

    public jzs(jzv jzvVar, kbz kbzVar, long j, poe poeVar, pkf pkfVar, pdk pdkVar, kbq kbqVar) {
        this.a = kbzVar;
        this.b = j;
        this.c = poeVar;
        this.d = pkfVar;
        this.e = pdkVar;
        this.f = kbqVar;
        this.g = jzvVar;
    }

    @Override // defpackage.iaf
    public final void a(iby ibyVar, HardwareBuffer hardwareBuffer, ShotMetadata shotMetadata) {
        Long lValueOf = Long.valueOf(this.b);
        syu syuVarM = ske.M(this.c);
        kbz kbzVar = this.a;
        poj pojVarB = this.g.c.b(new jzw((ltr) kbzVar.b, lValueOf, syuVarM, kbzVar.a), hardwareBuffer, shotMetadata);
        this.d.l();
        this.e.close();
        this.f.c(pojVarB);
    }
}
