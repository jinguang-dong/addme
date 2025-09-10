package defpackage;

import android.content.Context;
import android.os.Debug;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qtx {
    public static final /* synthetic */ int e = 0;
    public final uem a;
    public final Context b;
    public final uem c;
    public final sjp d;

    static {
        rnt.y(new kus(4));
    }

    public qtx(final uem uemVar, Context context, uem uemVar2, final uem uemVar3, sjp sjpVar) {
        this.d = sjpVar;
        uemVar.getClass();
        final rww rwwVarY = rnt.y(new fvq(uemVar, 15));
        this.a = new uem() { // from class: qtv
            @Override // defpackage.uem, defpackage.uel
            public final Object a() {
                int i = qtx.e;
                return ((Boolean) uemVar3.a()).booleanValue() ? (qtk) rwwVarY.fr() : uemVar.a();
            }
        };
        this.b = context;
        this.c = uemVar2;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [sgt, shi] */
    public static /* synthetic */ rwc a() {
        try {
            return rwc.j(Debug.MemoryInfo.class.getDeclaredMethod("getOtherPss", Integer.TYPE));
        } catch (Error | Exception e2) {
            ((sgt) ((sgt) qnj.a.c().i(e2)).M((char) 5759)).s("MemoryInfo.getOtherPss(which) failure");
            return rvk.a;
        } catch (NoSuchMethodException unused) {
            return rvk.a;
        }
    }

    public static Long b(Pattern pattern, String str) {
        Matcher matcher = pattern.matcher(str);
        try {
            if (matcher.find()) {
                String strGroup = matcher.group(1);
                rnt.x(strGroup);
                return Long.valueOf(Long.parseLong(strGroup));
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }
}
