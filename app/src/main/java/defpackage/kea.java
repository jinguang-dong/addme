package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.camera.util.ui.GcaTextView;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kea {
    public final ViewGroup a;
    public final View b;
    public final GcaTextView c;

    public kea() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kea) {
            kea keaVar = (kea) obj;
            if (this.a.equals(keaVar.a) && this.b.equals(keaVar.b) && this.c.equals(keaVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        return this.c.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        GcaTextView gcaTextView = this.c;
        View view = this.b;
        return "{" + this.a.toString() + ", " + view.toString() + ", " + gcaTextView.toString() + "}";
    }

    public kea(ViewGroup viewGroup, View view, GcaTextView gcaTextView) {
        viewGroup.getClass();
        this.a = viewGroup;
        view.getClass();
        this.b = view;
        gcaTextView.getClass();
        this.c = gcaTextView;
    }
}
