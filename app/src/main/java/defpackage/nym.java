package defpackage;

import android.content.Context;
import android.text.Html;
import android.view.View;
import android.widget.Toast;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class nym implements View.OnLongClickListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ nym(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i = this.b;
        if (i == 0) {
            nyn nynVar = (nyn) this.a;
            if (nynVar.a) {
                nynVar.b = true;
                nynVar.b();
            }
            return true;
        }
        if (i != 1) {
            nyn nynVar2 = (nyn) this.a;
            if (nynVar2.a) {
                nynVar2.c = true;
                nynVar2.b();
            }
            return true;
        }
        Context context = (Context) this.a;
        long jB = lwp.b(context);
        if (jB == -1) {
            return false;
        }
        Toast.makeText(context, Html.fromHtml(context.getString(R.string.camera_hal_version_message, jB != lwp.a(context, 2097152) ? mn.b(jB, "<b>", "</b>") : Long.toString(jB)), 63), 1).show();
        return true;
    }
}
