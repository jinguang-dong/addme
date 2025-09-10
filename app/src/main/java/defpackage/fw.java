package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.google.ar.core.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fw extends BaseAdapter {
    final /* synthetic */ fx a;
    private int b = -1;

    public fw(fx fxVar) {
        this.a = fxVar;
        b();
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final gd getItem(int i) {
        ArrayList arrayListE = this.a.c.e();
        int i2 = this.b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (gd) arrayListE.get(i);
    }

    final void b() {
        gb gbVar = this.a.c;
        gd gdVar = gbVar.i;
        if (gdVar != null) {
            ArrayList arrayListE = gbVar.e();
            int size = arrayListE.size();
            for (int i = 0; i < size; i++) {
                if (((gd) arrayListE.get(i)) == gdVar) {
                    this.b = i;
                    return;
                }
            }
        }
        this.b = -1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        int size = this.a.c.e().size();
        return this.b < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.a.b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((gn) view).f(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        b();
        super.notifyDataSetChanged();
    }
}
