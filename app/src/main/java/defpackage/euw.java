package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.net.URL;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class euw implements evg {
    private final /* synthetic */ int a;
    private final Object b;

    public euw(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    private static Uri c(String str) {
        return Uri.fromFile(new File(str));
    }

    @Override // defpackage.evg
    public final /* synthetic */ boolean a(Object obj) {
        int i = this.a;
        if (i == 0) {
            return true;
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return eoy.a((Uri) obj);
        }
        if (i == 3) {
            return true;
        }
        if (i == 4) {
            Uri uri = (Uri) obj;
            return eoy.a(uri) && !eoy.c(uri);
        }
        if (i != 5) {
            return true;
        }
        Uri uri2 = (Uri) obj;
        return eoy.a(uri2) && eoy.c(uri2);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [euu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v13, types: [evg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [euh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [evg, java.lang.Object] */
    @Override // defpackage.evg
    public final /* synthetic */ tdy b(Object obj, int i, int i2, eqm eqmVar) {
        Uri uriC;
        Long l;
        int i3 = this.a;
        if (i3 == 0) {
            File file = (File) obj;
            return new tdy(new fai(file), new eut(file, (euu) this.b, 0));
        }
        if (i3 == 1) {
            byte[] bArr = (byte[]) obj;
            return new tdy(new fai(bArr), new eui(bArr, this.b));
        }
        if (i3 == 2) {
            Uri uri = (Uri) obj;
            return new tdy(new fai(uri), new evc((Context) this.b, uri));
        }
        if (i3 == 3) {
            String str = (String) obj;
            if (TextUtils.isEmpty(str)) {
                uriC = null;
            } else if (str.charAt(0) == '/') {
                uriC = c(str);
            } else {
                Uri uri2 = Uri.parse(str);
                uriC = uri2.getScheme() == null ? c(str) : uri2;
            }
            if (uriC != null) {
                ?? r4 = this.b;
                if (r4.a(uriC)) {
                    return r4.b(uriC, i, i2, eqmVar);
                }
            }
            return null;
        }
        if (i3 == 4) {
            Uri uri3 = (Uri) obj;
            if (!eoy.b(i, i2)) {
                return null;
            }
            fai faiVar = new fai(uri3);
            Context context = (Context) this.b;
            return new tdy(faiVar, eut.b(context, uri3, new erm(context.getContentResolver())));
        }
        if (i3 != 5) {
            return this.b.b(new eux((URL) obj), i, i2, eqmVar);
        }
        Uri uri4 = (Uri) obj;
        if (!eoy.b(i, i2) || (l = (Long) eqmVar.b(exs.a)) == null || l.longValue() != -1) {
            return null;
        }
        fai faiVar2 = new fai(uri4);
        Context context2 = (Context) this.b;
        return new tdy(faiVar2, eut.b(context2, uri4, new ern(context2.getContentResolver())));
    }

    public euw(Context context, int i, byte[] bArr) {
        this.a = i;
        this.b = context.getApplicationContext();
    }

    public euw(Context context, int i, char[] cArr) {
        this.a = i;
        this.b = context.getApplicationContext();
    }
}
