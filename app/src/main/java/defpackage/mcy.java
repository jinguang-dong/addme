package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mcy implements mcz {
    public List a = null;

    @Override // defpackage.mcz, defpackage.mda
    public void a() {
        List list = this.a;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((mda) it.next()).a();
            }
        }
    }

    @Override // defpackage.mcz, defpackage.mda
    public void b() {
        List list = this.a;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((mda) it.next()).b();
            }
        }
    }

    public final void c(mdg... mdgVarArr) {
        for (mdg mdgVar : mdgVarArr) {
            mdf mdfVar = new mdf(mdgVar);
            if (this.a == null) {
                this.a = new ArrayList();
            }
            this.a.add(mdfVar);
        }
    }

    public void d() {
    }

    public void e() {
    }

    @Override // defpackage.mcz
    public /* synthetic */ void g() {
    }
}
