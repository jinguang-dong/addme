package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uvk implements uiq {
    private final /* synthetic */ int c;
    public static final uvk b = new uvk(1);
    public static final uvk a = new uvk(0);

    public uvk(int i) {
        this.c = i;
    }

    @Override // defpackage.uiq
    public final /* synthetic */ Object a(Object obj) {
        if (this.c == 0) {
            return null;
        }
        View view = (View) obj;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            return new coq(viewGroup, 1).a();
        }
        return null;
    }
}
