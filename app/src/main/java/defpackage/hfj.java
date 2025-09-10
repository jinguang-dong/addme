package defpackage;

import android.widget.SearchView;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hfj implements SearchView.OnQueryTextListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public hfj(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.widget.SearchView.OnQueryTextListener
    public final boolean onQueryTextChange(String str) {
        if (this.b != 0) {
            ((hfi) this.a).b(str);
            return false;
        }
        hfk hfkVar = (hfk) this.a;
        hfkVar.c = str;
        SearchView.OnQueryTextListener onQueryTextListener = hfkVar.b;
        return onQueryTextListener != null && onQueryTextListener.onQueryTextChange(str);
    }

    @Override // android.widget.SearchView.OnQueryTextListener
    public final boolean onQueryTextSubmit(String str) {
        if (this.b != 0) {
            ((hfi) this.a).b(str);
            return true;
        }
        hfk hfkVar = (hfk) this.a;
        hfkVar.c = str;
        SearchView.OnQueryTextListener onQueryTextListener = hfkVar.b;
        boolean zOnQueryTextSubmit = onQueryTextListener != null ? onQueryTextListener.onQueryTextSubmit(str) : false;
        hfkVar.a.clearFocus();
        return zOnQueryTextSubmit;
    }
}
