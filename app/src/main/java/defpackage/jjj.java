package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.provider.Settings;
import android.text.TextUtils;
import j$.util.function.Predicate$CC;
import java.util.Locale;
import java.util.function.Predicate;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class jjj implements Predicate {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ jjj(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.b) {
        }
        return Predicate$CC.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* renamed from: negate */
    public final /* synthetic */ Predicate mo32negate() {
        switch (this.b) {
        }
        return Predicate$CC.$default$negate(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.b) {
        }
        return Predicate$CC.$default$or(this, predicate);
    }

    /* JADX WARN: Type inference failed for: r5v35, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r5v39, types: [java.lang.Object, owq] */
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) throws Resources.NotFoundException {
        CharSequence string;
        switch (this.b) {
            case 0:
                sgv sgvVar = jjn.a;
                return ((jju) obj).c() == this.a;
            case 1:
                sgv sgvVar2 = jjn.a;
                return ((jju) obj).b().equals(this.a);
            case 2:
                sgv sgvVar3 = jjn.a;
                return ((jju) obj).c().equals(this.a);
            case 3:
                return ((jkx) this.a).e.contains(((jju) obj).b());
            case 4:
                return !((jkx) this.a).f.contains(((jju) obj).c());
            case 5:
                return Boolean.TRUE.equals(((kgl) this.a).a.get((String) obj));
            case 6:
                return ((krs) this.a).equals(((krz) obj).h());
            case 7:
                return ((krz) obj).p((krj) this.a);
            case 8:
                return ((krz) obj).p((krj) this.a);
            case 9:
                sgv sgvVar4 = ktb.a;
                return !((Boolean) ((ovx) this.a).d).booleanValue();
            case 10:
                krj krjVar = (krj) obj;
                sgv sgvVar5 = ktb.a;
                return (krjVar.s() || ((Boolean) this.a.dL()).booleanValue()) && nkw.NIGHT_SIGHT.equals(krjVar.d());
            case 11:
                krj krjVar2 = (krj) obj;
                sgv sgvVar6 = ktb.a;
                return (nkw.PHOTO.equals(krjVar2.d()) || nkw.NIGHT_SIGHT.equals(krjVar2.d())) && ((Boolean) this.a.dL()).booleanValue();
            case 12:
                return ((krs) this.a).equals(((kto) obj).g());
            case 13:
                return ((krs) this.a).equals(((kto) obj).g());
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return ((krs) this.a).equals(((kto) obj).g());
            case 15:
                return ((krs) this.a).equals(((kto) obj).g());
            case 16:
                return ((krs) this.a).equals(((kto) obj).g());
            case 17:
                return ((lnx) obj).a != ((lnx) this.a).a;
            case 18:
                krz krzVar = (krz) obj;
                krj krjVar3 = (krj) ((obu) this.a).a;
                return krzVar.p(krjVar3) && krzVar.o(krjVar3);
            case 19:
                ResolveInfo resolveInfo = (ResolveInfo) obj;
                Context context = ((mah) this.a).b;
                String string2 = Settings.Secure.getString(context.getContentResolver(), "nearby_sharing_component");
                ComponentName componentNameUnflattenFromString = !TextUtils.isEmpty(string2) ? ComponentName.unflattenFromString(string2) : null;
                if (componentNameUnflattenFromString == null) {
                    componentNameUnflattenFromString = new ComponentName("com.google.android.gms", "com.google.android.gms.nearby.sharing.ShareSheetActivity");
                }
                if (!componentNameUnflattenFromString.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                    return false;
                }
                if (componentNameUnflattenFromString.getClassName().equals(resolveInfo.activityInfo.name)) {
                    return true;
                }
                if (TextUtils.isEmpty(resolveInfo.activityInfo.nonLocalizedLabel)) {
                    Configuration configuration = context.getResources().getConfiguration();
                    configuration.setLocale(Locale.ROOT);
                    try {
                        string = context.createPackageContext(resolveInfo.activityInfo.packageName, 0).createConfigurationContext(configuration).getResources().getString(resolveInfo.activityInfo.labelRes);
                    } catch (PackageManager.NameNotFoundException unused) {
                        string = "";
                    }
                } else {
                    string = resolveInfo.activityInfo.nonLocalizedLabel;
                }
                return "Nearby Share".contentEquals(string);
            default:
                return ((mux) obj).a.equals(this.a);
        }
    }
}
