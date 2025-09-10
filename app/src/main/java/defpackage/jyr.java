package defpackage;

import android.hardware.HardwareBuffer;
import com.google.googlex.gcam.ShotMetadata;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jyr {
    public final /* synthetic */ pkf a;
    public final /* synthetic */ kbz b;
    public final /* synthetic */ long c;
    public final /* synthetic */ poe d;
    public final /* synthetic */ poj e;
    public final /* synthetic */ poj f;
    public final /* synthetic */ kbq g;
    final /* synthetic */ pbc h;
    public final /* synthetic */ jys i;

    public jyr(jys jysVar, pkf pkfVar, kbz kbzVar, long j, poe poeVar, poj pojVar, poj pojVar2, kbq kbqVar, pbc pbcVar) {
        this.a = pkfVar;
        this.b = kbzVar;
        this.c = j;
        this.d = poeVar;
        this.e = pojVar;
        this.f = pojVar2;
        this.g = kbqVar;
        this.h = pbcVar;
        this.i = jysVar;
    }

    public final poj a(HardwareBuffer hardwareBuffer, ShotMetadata shotMetadata) {
        Long lValueOf = Long.valueOf(this.c);
        syu syuVarM = ske.M(this.d);
        kbz kbzVar = this.b;
        return this.i.a.b(new jzw((ltr) kbzVar.b, lValueOf, syuVarM, kbzVar.a), hardwareBuffer, shotMetadata);
    }

    public final void b(RuntimeException runtimeException) {
        this.a.l();
        this.f.close();
        this.h.e("Couldn't retrieve Rgb result from FastMomentsHdr", runtimeException);
        this.g.b(runtimeException);
    }
}
