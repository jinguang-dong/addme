package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mdd implements mcz, mdc {
    public final mcz a;
    private final mcz[] b;

    public mdd(mcz mczVar, mcz... mczVarArr) {
        this.a = mczVar;
        this.b = mczVarArr;
    }

    @Override // defpackage.mcz, defpackage.mda
    public final void a() {
        this.a.a();
        int i = 0;
        while (true) {
            mcz[] mczVarArr = this.b;
            if (i >= mczVarArr.length) {
                return;
            }
            mczVarArr[i].a();
            i++;
        }
    }

    @Override // defpackage.mcz, defpackage.mda
    public final void b() {
        int i = 0;
        while (true) {
            mcz[] mczVarArr = this.b;
            if (i >= mczVarArr.length) {
                this.a.b();
                return;
            } else {
                mczVarArr[i].b();
                i++;
            }
        }
    }

    @Override // defpackage.mcz
    public final void g() {
        jea.z(this);
    }

    @Override // defpackage.mdc
    public final void i() {
        jea.y(this.a);
        int i = 0;
        while (true) {
            mcz[] mczVarArr = this.b;
            if (i >= mczVarArr.length) {
                return;
            }
            jea.y(mczVarArr[i]);
            i++;
        }
    }
}
