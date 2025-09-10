package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uun extends uhp implements url, uhq {
    public final url a;
    public final uhf b;
    public final int c;
    private uhf d;
    private uhb e;

    public uun(url urlVar, uhf uhfVar) {
        super(uuk.a, uhg.a);
        this.a = urlVar;
        this.b = uhfVar;
        this.c = ((Number) uhfVar.fold(0, new ane(12))).intValue();
    }

    @Override // defpackage.url
    public final Object a(Object obj, uhb uhbVar) {
        try {
            uhf uhfVarQ = uhbVar.q();
            ujp.T(uhfVarQ);
            uhf uhfVar = this.d;
            if (uhfVar != uhfVarQ) {
                if (uhfVar instanceof uuh) {
                    throw new IllegalStateException(ujp.l("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((uuh) uhfVar).a + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            "));
                }
                if (((Number) uhfVarQ.fold(0, new aml(this, 6))).intValue() != this.c) {
                    throw new IllegalStateException("Flow invariant is violated:\n\t\tFlow was collected in " + this.b + ",\n\t\tbut emission happened in " + uhfVarQ + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead");
                }
                this.d = uhfVarQ;
            }
            this.e = uhbVar;
            uiv uivVar = uup.a;
            url urlVar = this.a;
            urlVar.getClass();
            Object objA = uivVar.a(urlVar, obj, this);
            uhi uhiVar = uhi.a;
            if (!a.ao(objA, uhiVar)) {
                this.e = null;
            }
            if (objA == uhiVar) {
                uhbVar.getClass();
            }
            return objA == uhiVar ? objA : ufg.a;
        } catch (Throwable th) {
            this.d = new uuh(th, uhbVar.q());
            throw th;
        }
    }

    @Override // defpackage.uhn
    protected final Object b(Object obj) {
        Throwable thA = uex.a(obj);
        if (thA != null) {
            this.d = new uuh(thA, q());
        }
        uhb uhbVar = this.e;
        if (uhbVar != null) {
            uhbVar.fW(obj);
        }
        return uhi.a;
    }

    @Override // defpackage.uhn, defpackage.uhq
    public final uhq cK() {
        uhb uhbVar = this.e;
        if (uhbVar instanceof uhq) {
            return (uhq) uhbVar;
        }
        return null;
    }

    @Override // defpackage.uhp, defpackage.uhn
    public final void f() {
        super.f();
    }

    @Override // defpackage.uhp, defpackage.uhb
    public final uhf q() {
        uhf uhfVar = this.d;
        return uhfVar == null ? uhg.a : uhfVar;
    }

    @Override // defpackage.uhn, defpackage.uhq
    public final void cL() {
    }
}
