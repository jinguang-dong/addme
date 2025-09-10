package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eur implements evg {
    private final /* synthetic */ int a;
    private final Object b;
    private final Object c;

    public eur(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    private final Uri c(Integer num) throws Resources.NotFoundException {
        try {
            Object obj = this.b;
            return Uri.parse("android.resource://" + ((Resources) obj).getResourcePackageName(num.intValue()) + "/" + ((Resources) obj).getResourceTypeName(num.intValue()) + "/" + ((Resources) obj).getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e) {
            if (!Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            Objects.toString(num);
            Log.w("ResourceLoader", "Received invalid resource id: ".concat(String.valueOf(num)), e);
            return null;
        }
    }

    @Override // defpackage.evg
    public final /* synthetic */ boolean a(Object obj) {
        int i = this.a;
        if (i == 0) {
            return true;
        }
        if (i == 1) {
            Uri uri = (Uri) obj;
            return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
        }
        if (i != 2) {
            Uri uri2 = (Uri) obj;
            return "android.resource".equals(uri2.getScheme()) && ((Context) this.b).getPackageName().equals(uri2.getAuthority());
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [euq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v17, types: [evg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5, types: [evg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v8, types: [evg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4, types: [euf, java.lang.Object] */
    @Override // defpackage.evg
    public final /* synthetic */ tdy b(Object obj, int i, int i2, eqm eqmVar) throws Resources.NotFoundException, NumberFormatException {
        int i3 = this.a;
        if (i3 == 0) {
            Integer num = (Integer) obj;
            Resources.Theme theme = (Resources.Theme) eqmVar.b(exz.a);
            return new tdy(new fai(num), new eup(theme, theme != null ? theme.getResources() : ((Context) this.b).getResources(), this.c, num.intValue()));
        }
        if (i3 == 1) {
            Uri uri = (Uri) obj;
            return new tdy(new fai(uri), this.c.a((AssetManager) this.b, uri.toString().substring(22)));
        }
        if (i3 == 2) {
            Uri uriC = c((Integer) obj);
            if (uriC == null) {
                return null;
            }
            return this.c.b(uriC, i, i2, eqmVar);
        }
        Uri uri2 = (Uri) obj;
        List<String> pathSegments = uri2.getPathSegments();
        if (pathSegments.size() == 1) {
            try {
                int i4 = Integer.parseInt(uri2.getPathSegments().get(0));
                if (i4 != 0) {
                    return this.c.b(Integer.valueOf(i4), i, i2, eqmVar);
                }
                if (Log.isLoggable("ResourceUriLoader", 5)) {
                    Log.w("ResourceUriLoader", eld.b(uri2, "Failed to parse a valid non-0 resource id from: "));
                }
                return null;
            } catch (NumberFormatException e) {
                if (Log.isLoggable("ResourceUriLoader", 5)) {
                    Log.w("ResourceUriLoader", "Failed to parse resource id from: ".concat(String.valueOf(String.valueOf(uri2))), e);
                }
                return null;
            }
        }
        if (pathSegments.size() != 2) {
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                Log.w("ResourceUriLoader", "Failed to parse resource uri: ".concat(String.valueOf(String.valueOf(uri2))));
            }
            return null;
        }
        List<String> pathSegments2 = uri2.getPathSegments();
        String str = pathSegments2.get(0);
        String str2 = pathSegments2.get(1);
        Context context = (Context) this.b;
        int identifier = context.getResources().getIdentifier(str2, str, context.getPackageName());
        if (identifier != 0) {
            return this.c.b(Integer.valueOf(identifier), i, i2, eqmVar);
        }
        if (Log.isLoggable("ResourceUriLoader", 5)) {
            Log.w("ResourceUriLoader", "Failed to find resource id for: ".concat(String.valueOf(String.valueOf(uri2))));
        }
        return null;
    }

    public eur(Context context, euq euqVar, int i) {
        this.a = i;
        this.b = context.getApplicationContext();
        this.c = euqVar;
    }

    public eur(Context context, evg evgVar, int i) {
        this.a = i;
        this.b = context.getApplicationContext();
        this.c = evgVar;
    }
}
