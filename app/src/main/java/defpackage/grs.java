package defpackage;

import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.camera.jni.saliency.tLp.KsvNaXS;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class grs implements grx, gru {
    private final /* synthetic */ int a;
    private final Object b;
    private final Object c;

    public grs(jod jodVar, String str, int i) {
        this.a = i;
        this.c = jodVar;
        this.b = str;
    }

    @Override // defpackage.grx
    public final void b() {
        int i = this.a;
        if (i == 0) {
            ((jod) this.c).d(a());
            return;
        }
        if (i == 1) {
            ((jod) this.c).d(a());
        } else if (i == 2) {
            ((jod) this.c).d(a());
        } else if (i != 3) {
            ((jod) this.b).d(a());
        } else {
            ((jod) this.c).d(a());
        }
    }

    public grs(jod jodVar, String str, int i, int[] iArr) {
        this.a = i;
        this.b = jodVar;
        this.c = Uri.parse("https://google.com/search").buildUpon().appendQueryParameter("q", str).appendQueryParameter("tbm", "shop").appendQueryParameter("source", "google-camera").build();
    }

    @Override // defpackage.gru
    public final Intent a() {
        int i = this.a;
        if (i == 0) {
            return new Intent("android.intent.action.VIEW", Uri.parse(KsvNaXS.xIAJGrP.concat(String.valueOf(this.b))));
        }
        if (i == 1) {
            return new Intent("android.intent.action.VIEW", Uri.fromParts("tel", (String) this.b, ""));
        }
        if (i == 2) {
            return new Intent("android.intent.action.VIEW", Uri.parse((String) this.b));
        }
        if (i != 3) {
            return new Intent("android.intent.action.VIEW", (Uri) this.c);
        }
        Intent intent = new Intent("android.intent.action.WEB_SEARCH");
        intent.putExtra("query", (String) this.b);
        return intent;
    }
}
