package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fh implements fe {
    public final ActionMode.Callback a;
    public final Context b;
    final ArrayList c = new ArrayList();
    final aaa d = new aaa();

    public fh(Context context, ActionMode.Callback callback) {
        this.b = context;
        this.a = callback;
    }

    @Override // defpackage.fe
    public final void a(ff ffVar) {
        throw null;
    }

    @Override // defpackage.fe
    public final boolean b(ff ffVar, MenuItem menuItem) {
        throw null;
    }

    @Override // defpackage.fe
    public final boolean c(ff ffVar, Menu menu) {
        throw null;
    }

    @Override // defpackage.fe
    public final void d(ff ffVar, Menu menu) {
        throw null;
    }

    public final ActionMode e(ff ffVar) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            fi fiVar = (fi) arrayList.get(i);
            if (fiVar != null && fiVar.b == ffVar) {
                return fiVar;
            }
        }
        fi fiVar2 = new fi(this.b, ffVar);
        arrayList.add(fiVar2);
        return fiVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Menu f(Menu menu) {
        aaa aaaVar = this.d;
        Menu menu2 = (Menu) aaaVar.get(menu);
        if (menu2 != null) {
            return menu2;
        }
        gp gpVar = new gp(this.b, menu);
        aaaVar.put(menu, gpVar);
        return gpVar;
    }
}
