package defpackage;

import android.content.Context;
import android.support.v7.view.menu.ExpandedMenuView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fx implements AdapterView.OnItemClickListener, gm {
    Context a;
    public LayoutInflater b;
    gb c;
    public ExpandedMenuView d;
    public gl e;
    public fw f;

    public fx(Context context) {
        this.a = context;
        this.b = LayoutInflater.from(context);
    }

    public final ListAdapter a() {
        if (this.f == null) {
            this.f = new fw(this);
        }
        return this.f;
    }

    @Override // defpackage.gm
    public final void b(Context context, gb gbVar) {
        if (this.a != null) {
            this.a = context;
            if (this.b == null) {
                this.b = LayoutInflater.from(context);
            }
        }
        this.c = gbVar;
        fw fwVar = this.f;
        if (fwVar != null) {
            fwVar.notifyDataSetChanged();
        }
    }

    @Override // defpackage.gm
    public final void c(gb gbVar, boolean z) {
        gl glVar = this.e;
        if (glVar != null) {
            glVar.a(gbVar, z);
        }
    }

    @Override // defpackage.gm
    public final void d(gl glVar) {
        throw null;
    }

    @Override // defpackage.gm
    public final boolean e() {
        return false;
    }

    @Override // defpackage.gm
    public final boolean f(gt gtVar) {
        if (!gtVar.hasVisibleItems()) {
            return false;
        }
        gc gcVar = new gc(gtVar);
        gb gbVar = gcVar.a;
        du duVar = new du(gbVar.a);
        gcVar.c = new fx(duVar.a());
        fx fxVar = gcVar.c;
        fxVar.e = gcVar;
        gbVar.g(fxVar);
        ListAdapter listAdapterA = gcVar.c.a();
        dq dqVar = duVar.a;
        dqVar.o = listAdapterA;
        dqVar.p = gcVar;
        View view = gbVar.g;
        if (view != null) {
            dqVar.e = view;
        } else {
            duVar.d(gbVar.f);
            duVar.f(gbVar.e);
        }
        duVar.e(gcVar);
        gcVar.b = duVar.b();
        gcVar.b.setOnDismissListener(gcVar);
        WindowManager.LayoutParams attributes = gcVar.b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        gcVar.b.show();
        gl glVar = this.e;
        if (glVar == null) {
            return true;
        }
        glVar.b(gtVar);
        return true;
    }

    @Override // defpackage.gm
    public final boolean g(gd gdVar) {
        return false;
    }

    @Override // defpackage.gm
    public final boolean h(gd gdVar) {
        return false;
    }

    @Override // defpackage.gm
    public final void i() {
        fw fwVar = this.f;
        if (fwVar != null) {
            fwVar.notifyDataSetChanged();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.c.A(this.f.getItem(i), this, 0);
    }
}
