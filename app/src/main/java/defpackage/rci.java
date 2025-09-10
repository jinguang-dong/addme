package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rci {
    public static final Account a = new Account("shared", "mobstore");

    public static Account a(String str) {
        if (d(str)) {
            return a;
        }
        int iIndexOf = str.indexOf(58);
        qpt.W(iIndexOf >= 0, "Malformed account", new Object[0]);
        return new Account(str.substring(iIndexOf + 1), str.substring(0, iIndexOf));
    }

    public static String b(Account account) {
        qpt.W(account.type.indexOf(58) == -1, "Account type contains ':'.", new Object[0]);
        qpt.W(account.type.indexOf(47) == -1, "Account type contains '/'.", new Object[0]);
        qpt.W(account.name.indexOf(47) == -1, "Account name contains '/'.", new Object[0]);
        if (c(account)) {
            return "shared";
        }
        return account.type + ":" + account.name;
    }

    public static boolean c(Account account) {
        return a.equals(account);
    }

    static boolean d(String str) {
        return "shared".equals(str);
    }
}
