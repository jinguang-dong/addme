package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class una extends ugx implements uhc {
    public static final ugy l = new ugy(uhc.k, new umz(0));

    public una() {
        super(uhc.k);
    }

    public abstract void a(uhf uhfVar, Runnable runnable);

    @Override // defpackage.uhc
    public final void d(uhb uhbVar) {
        umb umbVar = ((uvg) uhbVar).f;
        while (umbVar.a == uvh.b) {
        }
        Object obj = umbVar.a;
        uml umlVar = obj instanceof uml ? (uml) obj : null;
        if (umlVar != null) {
            umlVar.v();
        }
    }

    public boolean dw(uhf uhfVar) {
        return true;
    }

    public void f(uhf uhfVar, Runnable runnable) {
        uvh.b(this, uhfVar, runnable);
    }

    @Override // defpackage.uhc
    public final uhb fJ(uhb uhbVar) {
        return new uvg(this, uhbVar);
    }

    public una g(int i) {
        ung.u(i);
        return new uvp(this, i);
    }

    @Override // defpackage.ugx, defpackage.uhd, defpackage.uhf
    public final uhd get(uhe uheVar) {
        uheVar.getClass();
        if (!(uheVar instanceof ugy)) {
            if (uhc.k == uheVar) {
                return this;
            }
            return null;
        }
        ugy ugyVar = (ugy) uheVar;
        if (!ugyVar.b(getKey())) {
            return null;
        }
        uhd uhdVarA = ugyVar.a(this);
        if (uhdVarA instanceof uhd) {
            return uhdVarA;
        }
        return null;
    }

    @Override // defpackage.ugx, defpackage.uhf
    public final uhf minusKey(uhe uheVar) {
        uheVar.getClass();
        if (uheVar instanceof ugy) {
            ugy ugyVar = (ugy) uheVar;
            if (!ugyVar.b(getKey()) || ugyVar.a(this) == null) {
                return this;
            }
        } else if (uhc.k != uheVar) {
            return this;
        }
        return uhg.a;
    }

    public String toString() {
        return ung.a(this) + "@" + ung.b(this);
    }
}
