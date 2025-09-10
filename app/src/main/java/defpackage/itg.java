package defpackage;

import j$.time.Instant;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class itg {
    private static final sgv d = sgv.g("itg");
    public final lsu a;
    public final lsw b;
    public final mdm c;
    private boolean e = false;
    private final hqw f;

    public itg(qqq qqqVar, hqw hqwVar, mdm mdmVar) {
        lsw lswVarS = qqqVar.s(Instant.now().toEpochMilli(), false);
        this.b = lswVarS;
        this.a = lswVarS.a(ppo.f.k);
        this.f = hqwVar;
        this.c = mdmVar;
        shl shlVar = shx.a;
    }

    public final synchronized void a(pos posVar) {
        if (this.e) {
            return;
        }
        try {
            this.f.c(posVar, hqp.NIGHT);
            ((mdo) this.c).y = true;
            this.e = true;
        } catch (IOException e) {
            ((sgt) ((sgt) ((sgt) d.b().h(shx.a, "VideoKeplerSession")).i(e)).M(2314)).s("Error adding badge to output file.");
        }
    }
}
