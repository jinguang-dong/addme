package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class grm extends rgt {
    private final gqc c;

    public grm(rgu rguVar, gqc gqcVar) {
        super(rguVar);
        this.c = gqcVar;
    }

    @Override // defpackage.rgt
    public final void a(long j) {
        poj pojVar = (poj) this.c.c.remove(Long.valueOf(j));
        if (pojVar != null) {
            pojVar.close();
        }
    }

    @Override // defpackage.rgt
    public final void b(final rgw rgwVar) {
        final gri griVar = this.c.d;
        griVar.d.execute(new Runnable() { // from class: grg
            /* JADX WARN: Removed duplicated region for block: B:60:0x01fd  */
            /* JADX WARN: Removed duplicated region for block: B:87:0x02c5  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() throws defpackage.rfr {
                /*
                    Method dump skipped, instructions count: 759
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.grg.run():void");
            }
        });
    }
}
