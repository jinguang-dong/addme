package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.camera.jni.gxp.Caan.yoGAhrpjU;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exz implements eqo {
    public static final eql a = new eql("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme", null, eql.a);
    private final Context b;

    public exz(Context context) {
        this.b = context.getApplicationContext();
    }

    @Override // defpackage.eqo
    public final /* bridge */ /* synthetic */ esw a(Object obj, int i, int i2, eqm eqmVar) {
        return c((Uri) obj, eqmVar);
    }

    @Override // defpackage.eqo
    public final /* bridge */ /* synthetic */ boolean b(Object obj, eqm eqmVar) {
        String scheme = ((Uri) obj).getScheme();
        return scheme != null && scheme.equals("android.resource");
    }

    public final esw c(Uri uri, eqm eqmVar) throws PackageManager.NameNotFoundException, NumberFormatException {
        int identifier;
        Resources.Theme theme;
        Drawable drawableA;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            Context contextCreatePackageContext = this.b;
            if (!authority.equals(contextCreatePackageContext.getPackageName())) {
                try {
                    contextCreatePackageContext = contextCreatePackageContext.createPackageContext(authority, 0);
                } catch (PackageManager.NameNotFoundException e) {
                    Context context = this.b;
                    if (authority.contains(context.getPackageName())) {
                        contextCreatePackageContext = context;
                    } else {
                        throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: ".concat(String.valueOf(String.valueOf(uri))), e);
                    }
                }
            }
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() == 2) {
                List<String> pathSegments2 = uri.getPathSegments();
                String authority2 = uri.getAuthority();
                String str = pathSegments2.get(0);
                String str2 = pathSegments2.get(1);
                identifier = contextCreatePackageContext.getResources().getIdentifier(str2, str, authority2);
                if (identifier == 0) {
                    identifier = Resources.getSystem().getIdentifier(str2, str, "android");
                }
                if (identifier == 0) {
                    throw new IllegalArgumentException(yoGAhrpjU.yTmiQuckhPWuLx.concat(String.valueOf(String.valueOf(uri))));
                }
            } else if (pathSegments.size() == 1) {
                try {
                    identifier = Integer.parseInt(uri.getPathSegments().get(0));
                } catch (NumberFormatException e2) {
                    throw new IllegalArgumentException("Unrecognized Uri format: ".concat(String.valueOf(String.valueOf(uri))), e2);
                }
            } else {
                throw new IllegalArgumentException("Unrecognized Uri format: ".concat(String.valueOf(String.valueOf(uri))));
            }
            eoz.k(authority);
            Context context2 = this.b;
            if (authority.equals(context2.getPackageName())) {
                theme = (Resources.Theme) eqmVar.b(a);
            } else {
                theme = null;
            }
            if (theme == null) {
                drawableA = exw.a(context2, contextCreatePackageContext, identifier, null);
            } else {
                drawableA = exw.a(context2, context2, identifier, theme);
            }
            return exy.g(drawableA);
        }
        throw new IllegalStateException(mn.i(uri, "Package name for ", " is null or empty"));
    }
}
