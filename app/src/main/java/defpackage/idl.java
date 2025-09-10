package defpackage;

import com.google.googlex.gcam.ShotMetadata;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class idl implements ihc {
    public static final sgv a = sgv.g("idl");

    @Override // defpackage.ihc
    public final void a(ShotMetadata shotMetadata, lss lssVar, hxu hxuVar, iea ieaVar) {
        tpc tpcVarM = igf.a.m();
        long jA = ShotMetadata.a(shotMetadata);
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        igf igfVar = (igf) tpcVarM.b;
        igfVar.b |= 1;
        igfVar.d = jA;
        Map map = (Map) smz.j(ieaVar.b).b(new gbm(19)).c(new gbm(20)).e();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        igf igfVar2 = (igf) tpcVarM.b;
        tqm tqmVar = igfVar2.c;
        if (!tqmVar.b) {
            igfVar2.c = tqmVar.a();
        }
        new tpv(igfVar2.c, igf.e).putAll(map);
        ((sgt) a.b().M(1892)).s("Could not log fusion skip reasons.");
    }
}
