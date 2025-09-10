package defpackage;

import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public class grj {
    public static final Pattern a = Pattern.compile("MT:[A-Z0-9.-]{19,}((\\*[A-Z0-9.-]{19,})+)?");
    private static final sgv h;
    public final Context b;
    public final pql c;
    public nnw d;
    public int e;
    public int f;
    public final hbj g;
    private final gsm i;
    private final iso j;

    static {
        Pattern.compile("mfg-sp:\\/\\/pixel\\?format=[0-9]{1,3}\\.[0-9]{2}&uid=[0-9a-fA-F]{8}");
        h = sgv.g("grj");
    }

    public grj(Context context, iso isoVar, pql pqlVar, hbj hbjVar, gsm gsmVar) {
        this.b = context;
        this.j = isoVar;
        this.c = pqlVar;
        this.i = gsmVar;
        this.g = hbjVar;
    }

    public static boolean e(String str, String str2) {
        return str != null && rup.e(str, str2);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [sgt, shi] */
    public final void a(Uri uri, String str) {
        try {
            this.b.startActivity(new Intent("android.intent.action.VIEW").setData(uri));
        } catch (ActivityNotFoundException e) {
            ((sgt) ((sgt) h.c().i(e)).M((char) 1013)).s("Unable to Start activity, Copying text");
            this.j.u();
            ClipboardManager clipboardManager = (ClipboardManager) this.b.getSystemService("clipboard");
            if (clipboardManager != null) {
                clipboardManager.setPrimaryClip(ClipData.newPlainText("", str));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [sgt, shi] */
    public final void b(Intent intent) {
        try {
            this.b.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            ((sgt) ((sgt) h.b().i(e)).M((char) 1014)).s("Unable to Start Activity");
            this.j.u();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [sgt, shi] */
    public final void c(String str) {
        Intent intent = new Intent();
        intent.setAction("com.google.android.gms.mlkit_barcode_ui.INVOKE_BOTTOMSHEET");
        intent.putExtra("barcodeParcelRawValue", str);
        intent.addFlags(67108864);
        intent.setPackage("com.google.android.gms");
        try {
            this.i.a.b(intent);
        } catch (ActivityNotFoundException e) {
            ((sgt) ((sgt) h.b().i(e)).M((char) 1015)).s("Supporting Play Services version not available");
            this.j.u();
        }
    }

    public final void d(Uri uri, String str) {
        b(new Intent("android.intent.action.VIEW").setData(uri).setPackage(str));
    }
}
