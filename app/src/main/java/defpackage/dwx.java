package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dwx extends cpo {
    public dwx() {
        super(null);
    }

    @Override // defpackage.cpo
    public final void k(dfa dfaVar) {
        dfaVar.d();
        try {
            dfaVar.g("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + (System.currentTimeMillis() - dxx.a) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            dfaVar.h();
        } finally {
            dfaVar.f();
        }
    }
}
