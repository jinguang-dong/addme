package defpackage;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import j$.util.Collection;
import j$.util.Comparator$CC;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.ToIntFunction;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mbc implements mba {
    public static final Pattern a = Pattern.compile("^([A-Za-z][A-Za-z\\d_]*(\\.|\\$))+[A-Za-z][A-Za-z\\d_]*$");
    private final luj b;
    private final obu c;

    public mbc(obu obuVar, luj lujVar) {
        this.c = obuVar;
        this.b = lujVar;
    }

    public static scn h(String str, scn scnVar) {
        if (!str.isEmpty()) {
            List listF = rwr.b(',').f(str);
            if (listF.size() >= 2) {
                return scn.F(listF);
            }
        }
        return scnVar;
    }

    @Override // defpackage.mba
    public final Comparator a() {
        return Comparator$CC.comparingInt(new ToIntFunction() { // from class: mbb
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                String str = ((ResolveInfo) obj).activityInfo.packageName;
                sbr sbrVar = new sbr();
                uao uaoVar = uao.a;
                scn scnVarH = mbc.h(uaoVar.fr().b(), maz.d);
                scn scnVarH2 = mbc.h(uaoVar.fr().a(), sfd.a);
                int i = 0;
                if (!scnVarH2.isEmpty() && !this.a.i()) {
                    ArrayList arrayList = new ArrayList(scnVarH);
                    arrayList.removeAll(scnVarH2);
                    arrayList.addAll(0, scnVarH2);
                    scnVarH = scn.F(arrayList);
                }
                sgj sgjVarListIterator = scnVarH.listIterator();
                while (sgjVarListIterator.hasNext()) {
                    String str2 = (String) sgjVarListIterator.next();
                    if (mbc.a.matcher(str2).matches()) {
                        sbrVar.f(str2, Integer.valueOf(i));
                        i++;
                    }
                }
                Integer num = (Integer) sbrVar.b().get(str);
                if (num == null) {
                    num = Integer.MAX_VALUE;
                }
                return num.intValue();
            }
        });
    }

    @Override // defpackage.mba
    public final /* bridge */ /* synthetic */ List b(String str) {
        return (ArrayList) Collection.EL.stream(c(str)).filter(new mdn(1)).filter(new krd(new ConcurrentHashMap(), new maf(3), 6)).collect(Collectors.toCollection(new mae(2)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.mba
    public final List c(String str) {
        obu obuVar = this.c;
        ?? r0 = obuVar.a;
        List<ResolveInfo> listQueryIntentActivities = (List) r0.get(str);
        if (listQueryIntentActivities == null) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType(str);
            listQueryIntentActivities = ((PackageManager) obuVar.b).queryIntentActivities(intent, 0);
            r0.put(str, listQueryIntentActivities);
        }
        listQueryIntentActivities.size();
        return listQueryIntentActivities;
    }

    @Override // defpackage.mba
    public final boolean d(String str) {
        Collection.EL.stream(c(str)).map(new maf(4));
        throw null;
    }

    @Override // defpackage.mba
    public final boolean f() {
        throw null;
    }

    @Override // defpackage.mba
    public final void g() {
        if (!((Boolean) this.b.b(luf.ah)).booleanValue() || i()) {
            return;
        }
        int i = sbp.d;
        throw null;
    }

    public final boolean i() {
        luj lujVar = this.b;
        return ((Boolean) lujVar.b(luf.al)).booleanValue() || ((Boolean) lujVar.b(luf.am)).booleanValue();
    }

    @Override // defpackage.mba
    public final void e() {
    }
}
