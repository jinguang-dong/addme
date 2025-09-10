package defpackage;

import com.google.googlex.gcam.dirtylens.PrCd.SHXc;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uaq implements uap {
    public static final qxt a;
    public static final qxt b;

    @Override // defpackage.uap
    public final String a() {
        return (String) a.b();
    }

    @Override // defpackage.uap
    public final String b() {
        return (String) b.b();
    }

    static {
        qxr qxrVarB = new qxr(qxc.a("com.google.android.apps.camera")).c().a().b();
        qxrVarB.h("SocialShare__enable_social_share", true);
        a = qxrVarB.g("SocialShare__use_geolocation_app_ranking", "");
        qxrVarB.g(SHXc.AMEEWodRdAUhOh, "");
        b = qxrVarB.g("SocialShare__use_phenotype_app_ranking", "com.whatsapp,com.facebook.orca,com.zhiliaoapp.musically,com.ss.android.ugc.trill,com.instagram.android,com.facebook.katana,com.facebook.lite,com.snapchat.android,com.facebook.mlite,org.telegram.messenger,app.buzz.share,com.twitter.android,com.imo.android.imoim,com.google.android.youtube,in.mohalla.sharechat,com.discord,com.viber.voip,com.google.android.apps.tachyon,com.skype.raider,jp.naver.line.android,com.google.android.apps.dynamite,com.google.android.talk,com.google.android.apps.messaging,com.vsco.cam,com.tencent.mm,com.Slack,com.kakao.talk,org.thoughtcrime.securesms,kik.android,com.groupme.android,com.google.android.apps.googlevoice,com.verizon.messaging.vzmsgs,com.textra");
        qxrVarB.g("SocialShare__use_phenotype_video_allowlist", "");
    }
}
