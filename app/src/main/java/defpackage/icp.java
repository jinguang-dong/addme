package defpackage;

import com.google.googlex.gcam.ShotMetadata;
import java.util.UUID;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class icp {
    public static final sgv a = sgv.g("icp");
    public final ida c;
    public final kgw d;
    public final hbj e;
    public final ocq f;
    public final ggg g;
    private final kjc h = new kjc(1);
    public final Executor b = new ouy(ojl.bZ("BurstEnc"));

    public icp(ocq ocqVar, kgw kgwVar, ggg gggVar, ida idaVar, hbj hbjVar) {
        this.f = ocqVar;
        this.d = kgwVar;
        this.g = gggVar;
        this.c = idaVar;
        this.e = hbjVar;
    }

    public final syu a(long j, obu obuVar, lgn lgnVar, int i, boolean z, ico icoVar, lss lssVar, UUID uuid, ShotMetadata shotMetadata, rwc rwcVar) {
        szh szhVar = new szh();
        ske.W(this.h.a(new icl(this, obuVar, z, shotMetadata, i, lssVar)), new icm(this, i, icoVar, lgnVar, lssVar, uuid, rwcVar, szhVar), sxo.a);
        return szhVar;
    }
}
