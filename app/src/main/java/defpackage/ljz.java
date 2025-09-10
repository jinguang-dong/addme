package defpackage;

import android.view.View;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ljz {
    public final View a;
    public final TextView b;
    public final String c;
    public final View d;
    public final nhz e;

    public ljz() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ljz) {
            ljz ljzVar = (ljz) obj;
            if (this.a.equals(ljzVar.a) && this.b.equals(ljzVar.b) && this.c.equals(ljzVar.c) && this.d.equals(ljzVar.d) && this.e.equals(ljzVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
        return this.e.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        nhz nhzVar = this.e;
        View view = this.d;
        TextView textView = this.b;
        return "{" + this.a.toString() + ", " + textView.toString() + ", " + this.c + ", " + view.toString() + ", " + nhzVar.toString() + "}";
    }

    public ljz(View view, TextView textView, String str, View view2, nhz nhzVar) {
        view.getClass();
        this.a = view;
        textView.getClass();
        this.b = textView;
        str.getClass();
        this.c = str;
        view2.getClass();
        this.d = view2;
        this.e = nhzVar;
    }
}
